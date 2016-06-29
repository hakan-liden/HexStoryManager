package nu.hex.story.manager.core.service.command.person;

import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.List;
import nu.hex.story.manager.core.domain.Person;
import nu.hex.story.manager.core.domain.PersonalEvent;
import nu.hex.story.manager.core.domain.Portrait;
import nu.hex.story.manager.core.service.command.AbstractServiceCommand;
import se.digitman.lightxml.NodeFactory;
import se.digitman.lightxml.XmlDocument;
import se.digitman.lightxml.XmlNode;

/**
 * Created 2016-jun-27
 *
 * @author hl
 */
public class GetFamilyTreeXmlCommand extends AbstractServiceCommand<XmlDocument> {

    private final Person mother;
    private final Person father;

    public GetFamilyTreeXmlCommand(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
    }

    @Override
    public XmlDocument execute() {
        XmlDocument result = new XmlDocument(NodeFactory.createNode("family-tree"));
        result.getRoot().addAttribute("family", "The " + father.getFamilyName() + " Family");
        result.getRoot().addAttribute("residence", father.getResidence());
        result.getRoot().addChild(createChildNode(father));
        result.getRoot().addChild(createChildNode(mother));
        return result;
    }

    private XmlNode createChildNode(Person p) {
        XmlNode result = NodeFactory.createNode(p.getSex().name().toLowerCase());
        result.addAttribute("id", p.getId().toString());
        result.addAttribute("family-name", p.getFamilyName());
        result.addAttribute("given-name", p.getGivenName());
        if (p.getFather() != null) {
            result.addAttribute("father", p.getFather().getName());
        }
        result.addAttribute("date-of-birth", p.getDateOfBirth().format(DateTimeFormatter.ISO_DATE));
        if (p.getPlaceOfBirth() != null) {
            result.addAttribute("place-of-birth", p.getPlaceOfBirth());
        }
        if (p.getDateOfDeath() != null) {
            result.addAttribute("date-of-death", p.getDateOfDeath().format(DateTimeFormatter.ISO_DATE));
        }
        if (p.getPlaceOfDeath() != null) {
            result.addAttribute("place-of-death", p.getPlaceOfDeath());
        }
        if (p.getCauseOfDeath() != null) {
            result.addAttribute("cause-of-death", p.getCauseOfDeath());
        }
        if (!p.getPortraits().isEmpty()) {
            XmlNode portraits = NodeFactory.createNode("portaits");
            p.getPortraits().stream().forEach((portrait) -> {
                portraits.addChild(createPortaitNode(portrait));
            });
            result.addChild(portraits);
        }
        if (!p.getEvents().isEmpty()) {
            XmlNode events = NodeFactory.createNode("personal-events");
            p.getEvents().stream().forEach((e) -> {
                events.addChild(createEventNode(e));
            });
            result.addChild(events);
        }
        if (p.getSex().equals(Person.Sex.FEMALE)) {
            List<Person> children = getDaoFactory().getPersonDao().getChildren(p);
            if (!children.isEmpty()) {
                children.stream().forEach((child) -> {
                    result.addChild(createChildNode(child));
                });
            }
        }
        return result;
    }

    private XmlNode createEventNode(PersonalEvent e) {
        XmlNode result = NodeFactory.createNode("event");
        result.addAttribute("id", e.getId().toString());
        result.addAttribute("date", e.getDate().format(DateTimeFormatter.ISO_DATE));
        result.addText(e.getDescription());
        return result;
    }

    private XmlNode createPortaitNode(Portrait p) {
        XmlNode result = NodeFactory.createNode("portrait");
        result.addAttribute("id", p.getId().toString());
        result.addAttribute("label", p.getLabel());
        result.addAttribute("media-type", p.getMediaType());
        result.addAttribute("date", p.getDate().format(DateTimeFormatter.ISO_DATE));
        result.addText(Base64.getEncoder().encodeToString(p.getImageAsByteArray()));
        return result;
    }
}