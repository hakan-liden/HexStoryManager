package nu.hex.story.manager.util.currency.convert;

/**
 * Created 2016-okt-23
 *
 * @author hl
 */
public class NorwegianCrownToUSDollarConverter extends AbstractDollarConverter {

    public NorwegianCrownToUSDollarConverter(Integer year) {
        super(year, 1819, 2015);
    }

    static {
        RATIO_MAP.put(1819, 0.23345242519717385);
        RATIO_MAP.put(1820, 0.16410886588301415);
        RATIO_MAP.put(1821, 0.15248579289867553);
        RATIO_MAP.put(1822, 0.14084891897046206);
        RATIO_MAP.put(1823, 0.15652977251058559);
        RATIO_MAP.put(1824, 0.1835601678107054);
        RATIO_MAP.put(1825, 0.23428311709001648);
        RATIO_MAP.put(1826, 0.21659353385995903);
        RATIO_MAP.put(1827, 0.19814669433851304);
        RATIO_MAP.put(1828, 0.20108266930808852);
        RATIO_MAP.put(1829, 0.19430250646347283);
        RATIO_MAP.put(1830, 0.19286775058342487);
        RATIO_MAP.put(1831, 0.1989797908165254);
        RATIO_MAP.put(1832, 0.1928208925293472);
        RATIO_MAP.put(1833, 0.19871230452422206);
        RATIO_MAP.put(1834, 0.21453371526055554);
        RATIO_MAP.put(1835, 0.23542041377491943);
        RATIO_MAP.put(1836, 0.2395303671808906);
        RATIO_MAP.put(1837, 0.25294836615591315);
        RATIO_MAP.put(1838, 0.24184147774816583);
        RATIO_MAP.put(1839, 0.2529195771387006);
        RATIO_MAP.put(1840, 0.26567481402763016);
        RATIO_MAP.put(1841, 0.28065354106185825);
        RATIO_MAP.put(1842, 0.2697504538551383);
        RATIO_MAP.put(1843, 0.270298103669594);
        RATIO_MAP.put(1844, 0.265378836250112);
        RATIO_MAP.put(1845, 0.26955841748722525);
        RATIO_MAP.put(1846, 0.26701528181860923);
        RATIO_MAP.put(1847, 0.2657352469105621);
        RATIO_MAP.put(1848, 0.26359226704638006);
        RATIO_MAP.put(1849, 0.2594092939086547);
        RATIO_MAP.put(1850, 0.2666075864255151);
        RATIO_MAP.put(1851, 0.2730002730002728);
        RATIO_MAP.put(1852, 0.26933850463262254);
        RATIO_MAP.put(1853, 0.2766035955148171);
        RATIO_MAP.put(1854, 0.280944332566168);
        RATIO_MAP.put(1855, 0.27615589884188524);
        RATIO_MAP.put(1856, 0.2795660687307592);
        RATIO_MAP.put(1857, 0.28038850631434914);
        RATIO_MAP.put(1858, 0.27319023437999607);
        RATIO_MAP.put(1859, 0.27528292254766);
        RATIO_MAP.put(1860, 0.27201235371019195);
        RATIO_MAP.put(1861, 0.2649819645364262);
        RATIO_MAP.put(1862, 0.30956039526829204);
        RATIO_MAP.put(1863, 0.3941884169963145);
        RATIO_MAP.put(1864, 0.5544714062242273);
        RATIO_MAP.put(1865, 0.4276715259643236);
        RATIO_MAP.put(1866, 0.3826242000825157);
        RATIO_MAP.put(1867, 0.37247464826346666);
        RATIO_MAP.put(1868, 0.37315758674579813);
        RATIO_MAP.put(1869, 0.35384067740476627);
        RATIO_MAP.put(1870, 0.30846419019152277);
        RATIO_MAP.put(1871, 0.302466864401343);
        RATIO_MAP.put(1872, 0.3012408581763523);
        RATIO_MAP.put(1873, 0.3050705475539186);
        RATIO_MAP.put(1874, 0.297266717259413);
        RATIO_MAP.put(1875, 0.30608354043260255);
        RATIO_MAP.put(1876, 0.2971026627796893);
        RATIO_MAP.put(1877, 0.2776989489162955);
        RATIO_MAP.put(1878, 0.26687194578876916);
        RATIO_MAP.put(1879, 0.26527195948279186);
        RATIO_MAP.put(1880, 0.2653093889028962);
        RATIO_MAP.put(1881, 0.264178054495234);
        RATIO_MAP.put(1882, 0.2662192679571574);
        RATIO_MAP.put(1883, 0.264316139667763);
        RATIO_MAP.put(1884, 0.26438910266106364);
        RATIO_MAP.put(1885, 0.26484358692601906);
        RATIO_MAP.put(1886, 0.2653911327868287);
        RATIO_MAP.put(1887, 0.2649614541172319);
        RATIO_MAP.put(1888, 0.2661369090481975);
        RATIO_MAP.put(1889, 0.26582770587069654);
        RATIO_MAP.put(1890, 0.2650449222420028);
        RATIO_MAP.put(1891, 0.2657923278220862);
        RATIO_MAP.put(1892, 0.266456234345528);
        RATIO_MAP.put(1893, 0.2657529262167305);
        RATIO_MAP.put(1894, 0.2671402541612249);
        RATIO_MAP.put(1895, 0.26726364413284);
        RATIO_MAP.put(1896, 0.2663021076485593);
        RATIO_MAP.put(1897, 0.26606337440820044);
        RATIO_MAP.put(1898, 0.26469952445426004);
        RATIO_MAP.put(1899, 0.2648081892429867);
        RATIO_MAP.put(1900, 0.26515636817800176);
        RATIO_MAP.put(1901, 0.2662416260119793);
        RATIO_MAP.put(1902, 0.2658681007806259);
        RATIO_MAP.put(1903, 0.26522527426370074);
        RATIO_MAP.put(1904, 0.2659634341736546);
        RATIO_MAP.put(1905, 0.2660583706893189);
        RATIO_MAP.put(1906, 0.2643479932708954);
        RATIO_MAP.put(1907, 0.2641032088495955);
        RATIO_MAP.put(1908, 0.2656667438643168);
        RATIO_MAP.put(1909, 0.26711029639050365);
        RATIO_MAP.put(1910, 0.2670414844278357);
        RATIO_MAP.put(1911, 0.2670217025752515);
        RATIO_MAP.put(1912, 0.2670041080241114);
        RATIO_MAP.put(1913, 0.2664891845938734);
        RATIO_MAP.put(1914, 0.26294777770715094);
        RATIO_MAP.put(1915, 0.2593884340192377);
        RATIO_MAP.put(1916, 0.2832388456369581);
        RATIO_MAP.put(1917, 0.3016436497789527);
        RATIO_MAP.put(1918, 0.3042159495106535);
        RATIO_MAP.put(1919, 0.24400957584505006);
        RATIO_MAP.put(1920, 0.1630232878647211);
        RATIO_MAP.put(1921, 0.1486714186256791);
        RATIO_MAP.put(1922, 0.17508382396231129);
        RATIO_MAP.put(1923, 0.166751566109939);
        RATIO_MAP.put(1924, 0.139956664200401);
        RATIO_MAP.put(1925, 0.17764213254791558);
        RATIO_MAP.put(1926, 0.2232146894680434);
        RATIO_MAP.put(1927, 0.26054909886533234);
        RATIO_MAP.put(1928, 0.2670127952947505);
        RATIO_MAP.put(1929, 0.26692485274148575);
        RATIO_MAP.put(1930, 0.26760764919239144);
        RATIO_MAP.put(1931, 0.24906105945463847);
        RATIO_MAP.put(1932, 0.18026047933199474);
        RATIO_MAP.put(1933, 0.21163959888943026);
        RATIO_MAP.put(1934, 0.2534234293350808);
        RATIO_MAP.put(1935, 0.24615913343288862);
        RATIO_MAP.put(1936, 0.24964906302511142);
        RATIO_MAP.put(1937, 0.2483171395490506);
        RATIO_MAP.put(1938, 0.2455985339534193);
        RATIO_MAP.put(1939, 0.23292946410977108);
        RATIO_MAP.put(1940, 0.22766239712307318);
        RATIO_MAP.put(1941, 0.22773015720855347);
        RATIO_MAP.put(1942, 0.22773809523809532);
        RATIO_MAP.put(1943, 0.22773809523809532);
        RATIO_MAP.put(1944, 0.22773809523809532);
        RATIO_MAP.put(1945, 0.21110092740954353);
        RATIO_MAP.put(1946, 0.20161770501264792);
        RATIO_MAP.put(1947, 0.2015277777777784);
        RATIO_MAP.put(1948, 0.20152777777777836);
        RATIO_MAP.put(1949, 0.18173045980895947);
        RATIO_MAP.put(1950, 0.14005791505791543);
        RATIO_MAP.put(1951, 0.14005791505791543);
        RATIO_MAP.put(1952, 0.1400579150579149);
        RATIO_MAP.put(1953, 0.1400579150579151);
        RATIO_MAP.put(1954, 0.14044392424124189);
        RATIO_MAP.put(1955, 0.14006755576379498);
        RATIO_MAP.put(1956, 0.1401618592602978);
        RATIO_MAP.put(1957, 0.14021464349501978);
        RATIO_MAP.put(1958, 0.14009792204734173);
        RATIO_MAP.put(1959, 0.14047122825086172);
        RATIO_MAP.put(1960, 0.14035200218640784);
        RATIO_MAP.put(1961, 0.14018305801424705);
        RATIO_MAP.put(1962, 0.14027431875154028);
        RATIO_MAP.put(1963, 0.14005775387731095);
        RATIO_MAP.put(1964, 0.13989748616668615);
        RATIO_MAP.put(1965, 0.1401006642298914);
        RATIO_MAP.put(1966, 0.14005150948376136);
        RATIO_MAP.put(1967, 0.1400746540764233);
        RATIO_MAP.put(1968, 0.14022772258109673);
        RATIO_MAP.put(1969, 0.1402484023397197);
        RATIO_MAP.put(1970, 0.14020387994089503);
        RATIO_MAP.put(1971, 0.14288497328243943);
        RATIO_MAP.put(1972, 0.15206402789739554);
        RATIO_MAP.put(1973, 0.1751586752750369);
        RATIO_MAP.put(1974, 0.18172005791002402);
        RATIO_MAP.put(1975, 0.1918329958103372);
        RATIO_MAP.put(1976, 0.18352069715342087);
        RATIO_MAP.put(1977, 0.1880592624736719);
        RATIO_MAP.put(1978, 0.19115415761368368);
        RATIO_MAP.put(1979, 0.19764193553706116);
        RATIO_MAP.put(1980, 0.20259830023616363);
        RATIO_MAP.put(1981, 0.1747038850999672);
        RATIO_MAP.put(1982, 0.1555314012884908);
        RATIO_MAP.put(1983, 0.13721452961176753);
        RATIO_MAP.put(1984, 0.12286390138926281);
        RATIO_MAP.put(1985, 0.11675711825129348);
        RATIO_MAP.put(1986, 0.13540736113529966);
        RATIO_MAP.put(1987, 0.14865501146334129);
        RATIO_MAP.put(1988, 0.15375374339064113);
        RATIO_MAP.put(1989, 0.1451730253506969);
        RATIO_MAP.put(1990, 0.16005834930819668);
        RATIO_MAP.put(1991, 0.15449746307191017);
        RATIO_MAP.put(1992, 0.1613287859936714);
        RATIO_MAP.put(1993, 0.14109937821855303);
        RATIO_MAP.put(1994, 0.14176016979819214);
        RATIO_MAP.put(1995, 0.1578862827981835);
        RATIO_MAP.put(1996, 0.15490192716029114);
        RATIO_MAP.put(1997, 0.1415690615144204);
        RATIO_MAP.put(1998, 0.13256556758968693);
        RATIO_MAP.put(1999, 0.12831161513254818);
        RATIO_MAP.put(2000, 0.113810647877957);
        RATIO_MAP.put(2001, 0.11132246371289593);
        RATIO_MAP.put(2002, 0.12560373447797107);
        RATIO_MAP.put(2003, 0.14131517556530293);
        RATIO_MAP.put(2004, 0.14843025007406405);
        RATIO_MAP.put(2005, 0.15531162764853637);
        RATIO_MAP.put(2006, 0.15608269095823946);
        RATIO_MAP.put(2007, 0.17083975972710003);
        RATIO_MAP.put(2008, 0.17861932790089977);
        RATIO_MAP.put(2009, 0.15931605799335485);
        RATIO_MAP.put(2010, 0.16556027533039464);
        RATIO_MAP.put(2011, 0.17833997752774441);
        RATIO_MAP.put(2012, 0.17180786374236245);
        RATIO_MAP.put(2013, 0.17031946576604193);
        RATIO_MAP.put(2014, 0.15886098837802803);
        RATIO_MAP.put(2015, 0.12406698280972103);
    }
}
