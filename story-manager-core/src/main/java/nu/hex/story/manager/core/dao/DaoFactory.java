package nu.hex.story.manager.core.dao;

import javax.persistence.EntityManager;

/**
 * Created 2014-nov-26
 *
 * @author jep
 */
public class DaoFactory {

    private final EntityManager em;

    public DaoFactory(EntityManager em) {
        this.em = em;
    }

    public AtlasDao getAtlasDao() {
        return new AtlasDao(em);
    }

    public MapDao getMapDao() {
        return new MapDao(em);
    }

    public PersonDao getPersonDao() {
        return new PersonDao(em);
    }

    public PortraitDao getPortraitDao() {
        return new PortraitDao(em);
    }
    public IllustrationDao getIllustrationDao() {
        return new IllustrationDao(em);
    }

    public StoryDao getStoryDao() {
        return new StoryDao(em);
    }

    public ChapterDao getChapterDao() {
        return new ChapterDao(em);
    }

    public PlotDao getPlotDao() {
        return new PlotDao(em);
    }
}
