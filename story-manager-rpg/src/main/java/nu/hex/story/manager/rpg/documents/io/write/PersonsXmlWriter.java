package nu.hex.story.manager.rpg.documents.io.write;

import java.util.Arrays;
import java.util.List;
import nu.hex.story.manager.rpg.documents.PersonDocument;
import nu.hex.story.manager.rpg.documents.PortraitDocument;
import nu.hex.story.manager.rpg.documents.io.AbstractWriter;
import se.digitman.lightxml.NodeFactory;
import se.digitman.lightxml.XmlNode;

/**
 * Created 2016-nov-11
 *
 * @author hl
 */
public class PersonsXmlWriter extends AbstractWriter<List<PersonDocument>, XmlNode> {

    public PersonsXmlWriter(List<PersonDocument> doc) {
        super(doc);
    }

    public PersonsXmlWriter(PersonDocument doc) {
        super(Arrays.asList(doc));
    }

    @Override
    public XmlNode write() {
        XmlNode personsNode = NodeFactory.createNode("persons");
        for (PersonDocument person : doc) {
            XmlNode personNode = NodeFactory.createNode("person");
            personsNode.addChild(personNode);
            if (person.getFamilyName() != null) {
                personNode.addAttribute("family-name", person.getFamilyName());
            }
            if (person.getGivenName() != null) {
                personNode.addAttribute("given-name", person.getGivenName());
            }
            if (person.getMother() != null) {
                personNode.addAttribute("mother", person.getMother().getName());
            }
            if (person.getFather() != null) {
                personNode.addAttribute("father", person.getFather().getName());
            }
            if (person.getSex() != null) {
                personNode.addAttribute("sex", person.getSex().getLabel());
            }
            if (person.getCharacterClass() != null) {
                personNode.addAttribute("character-class", person.getCharacterClass());
            }
            if (person.getCharacterRace() != null) {
                personNode.addAttribute("character-race", person.getCharacterRace());
            }
            if (person.getBirthDate() != null) {
                personNode.addAttribute("date-of-birth", person.getBirthDate());
            }
            if (person.getPlaceOfBirth() != null) {
                personNode.addAttribute("place-of-birth", person.getPlaceOfBirth());
            }
            if (person.getDeathDate() != null) {
                personNode.addAttribute("date-of-death", person.getDeathDate());
            }
            if (person.getPlaceOfDeath() != null) {
                personNode.addAttribute("place-of-death", person.getPlaceOfDeath());
            }
            if (person.getCauseOfDeath() != null) {
                personNode.addAttribute("cause-of-death", person.getCauseOfDeath());
            }
            if (person.getChildren().size() > 0) {
                XmlNode childrenNode = NodeFactory.createNode("children");
                personNode.addChild(childrenNode);
                person.getChildren().stream().forEach((child) -> {
                    XmlNode childNode = NodeFactory.createNode("child");
                    childNode.addAttribute("name", child.getName());
                    childrenNode.addChild(childNode);
                });
            }
            if (person.getResidence() != null) {
                personNode.addAttribute("residence", person.getResidence());
            }
            XmlNode descriptionNode = NodeFactory.createNode("description");
            personNode.addChild(descriptionNode);
            if (person.getHeight() != null) {
                descriptionNode.addAttribute("height", person.getHeight());
            }
            if (person.getWeight() != null) {
                descriptionNode.addAttribute("weight", person.getWeight());
            }
            if (person.getEyes() != null) {
                descriptionNode.addAttribute("eyes", person.getEyes());
            }
            if (person.getHair() != null) {
                descriptionNode.addAttribute("hair", person.getHair());
            }
            if (person.getSkin() != null) {
                descriptionNode.addAttribute("skin", person.getSkin());
            }
            if (person.getDescription() != null) {
                descriptionNode.addText(person.getDescription());
            }
            if (person.getHistory() != null) {
                personNode.addChild(NodeFactory.createNode("history", person.getHistory()));
            }
            if (person.getNotes() != null) {
                personNode.addChild(NodeFactory.createNode("notes", person.getNotes()));
            }
            if (person.getPortrait() != null) {
                personNode.addChild(new PortraitXmlWriter((PortraitDocument) person.getPortrait()).write());
            }
            
        }
        return personsNode;
    }

}
