package nu.hex.story.manager.util.currency.convert;

/**
 * Created 2016-okt-23
 *
 * @author hl
 */
public class ItalianLiraToUSDollarConverter extends AbstractDollarConverter {

    public ItalianLiraToUSDollarConverter(Integer year) {
        super(year, 1880, 1998);
    }

    static {
        RATIO_MAP.put(1880, 0.1769890430121983);
        RATIO_MAP.put(1881, 0.18976302418144403);
        RATIO_MAP.put(1882, 0.18951820382130954);
        RATIO_MAP.put(1883, 0.19361997074852796);
        RATIO_MAP.put(1884, 0.19378326521494635);
        RATIO_MAP.put(1885, 0.19347702290022908);
        RATIO_MAP.put(1886, 0.19376117901853734);
        RATIO_MAP.put(1887, 0.19198265456040522);
        RATIO_MAP.put(1888, 0.19203059675830755);
        RATIO_MAP.put(1889, 0.19321734388816109);
        RATIO_MAP.put(1890, 0.19212664393172735);
        RATIO_MAP.put(1891, 0.1916415688157108);
        RATIO_MAP.put(1892, 0.18911585572416734);
        RATIO_MAP.put(1893, 0.1811415507507863);
        RATIO_MAP.put(1894, 0.17580222592802291);
        RATIO_MAP.put(1895, 0.18559244137617525);
        RATIO_MAP.put(1896, 0.18071379942007956);
        RATIO_MAP.put(1897, 0.18517898737280503);
        RATIO_MAP.put(1898, 0.1807499564873585);
        RATIO_MAP.put(1899, 0.18066628017362965);
        RATIO_MAP.put(1900, 0.18310812274379074);
        RATIO_MAP.put(1901, 0.18677697327152587);
        RATIO_MAP.put(1902, 0.19282530933084868);
        RATIO_MAP.put(1903, 0.19456025533830418);
        RATIO_MAP.put(1904, 0.19495150421285387);
        RATIO_MAP.put(1905, 0.19524318991743117);
        RATIO_MAP.put(1906, 0.19433169280079093);
        RATIO_MAP.put(1907, 0.1932826343662095);
        RATIO_MAP.put(1908, 0.1934571594525714);
        RATIO_MAP.put(1909, 0.1937312666921733);
        RATIO_MAP.put(1910, 0.19305767849695865);
        RATIO_MAP.put(1911, 0.19232432362812976);
        RATIO_MAP.put(1912, 0.1918698408260726);
        RATIO_MAP.put(1913, 0.19008237529062227);
        RATIO_MAP.put(1914, 0.1917210398765821);
        RATIO_MAP.put(1915, 0.16531351788984705);
        RATIO_MAP.put(1916, 0.15243831005070432);
        RATIO_MAP.put(1917, 0.1330014804177624);
        RATIO_MAP.put(1918, 0.12720758733925974);
        RATIO_MAP.put(1919, 0.11387626082143988);
        RATIO_MAP.put(1920, 0.03940811284833076);
        RATIO_MAP.put(1921, 0.043493109845185396);
        RATIO_MAP.put(1922, 0.047756334789719836);
        RATIO_MAP.put(1923, 0.04650886650943625);
        RATIO_MAP.put(1924, 0.04400709905020784);
        RATIO_MAP.put(1925, 0.04005875433364605);
        RATIO_MAP.put(1926, 0.03909220745937575);
        RATIO_MAP.put(1927, 0.051671365708889194);
        RATIO_MAP.put(1928, 0.05273758505123893);
        RATIO_MAP.put(1929, 0.05239101340211052);
        RATIO_MAP.put(1930, 0.052450232425440634);
        RATIO_MAP.put(1931, 0.05239693211127101);
        RATIO_MAP.put(1932, 0.052155647089070965);
        RATIO_MAP.put(1933, 0.06636131999361215);
        RATIO_MAP.put(1934, 0.08663156284914249);
        RATIO_MAP.put(1935, 0.08349496292939794);
        RATIO_MAP.put(1936, 0.07378327677987774);
        RATIO_MAP.put(1937, 0.05326823621196928);
        RATIO_MAP.put(1938, 0.052976222354923455);
        RATIO_MAP.put(1939, 0.05279894144636931);
        RATIO_MAP.put(1940, 0.05110194154230171);
        RATIO_MAP.put(1941, 0.05210504653986146);
        RATIO_MAP.put(1942, 0.052361095910240754);
        RATIO_MAP.put(1943, 0.05285714285714288);
        RATIO_MAP.put(1944, 0.05285714285714288);
        RATIO_MAP.put(1945, -0.04076479076479081);
        RATIO_MAP.put(1946, 0.003952955926932236);
        RATIO_MAP.put(1947, 0.0022376415225221226);
        RATIO_MAP.put(1948, 0.0023466806831825035);
        RATIO_MAP.put(1949, 0.0020095994639446244);
        RATIO_MAP.put(1950, 0.0016761018258792512);
        RATIO_MAP.put(1951, 0.0016565687944221316);
        RATIO_MAP.put(1952, 0.0016980639547294902);
        RATIO_MAP.put(1953, 0.0016668988176665124);
        RATIO_MAP.put(1954, 0.0016239503059537412);
        RATIO_MAP.put(1955, 0.0016388164113992664);
        RATIO_MAP.put(1956, 0.0016660654399262183);
        RATIO_MAP.put(1957, 0.0016873881250218875);
        RATIO_MAP.put(1958, 0.0016261612070117217);
        RATIO_MAP.put(1959, 0.0016259469187231636);
        RATIO_MAP.put(1960, 0.0016271440462332911);
        RATIO_MAP.put(1961, 0.0016282128769155803);
        RATIO_MAP.put(1962, 0.0016236690323084872);
        RATIO_MAP.put(1963, 0.0016121339668965172);
        RATIO_MAP.put(1964, 0.0015995132901038846);
        RATIO_MAP.put(1965, 0.0016086519181058257);
        RATIO_MAP.put(1966, 0.001613081243520905);
        RATIO_MAP.put(1967, 0.0016372104592543915);
        RATIO_MAP.put(1968, 0.0016664878875176105);
        RATIO_MAP.put(1969, 0.0016574077430758258);
        RATIO_MAP.put(1970, 0.0015787536371720332);
        RATIO_MAP.put(1971, 0.0016268735149859862);
        RATIO_MAP.put(1972, 0.0017215322488727022);
        RATIO_MAP.put(1973, 0.0017358301583189463);
        RATIO_MAP.put(1974, 0.0015528528452879368);
        RATIO_MAP.put(1975, 0.0015429353174296924);
        RATIO_MAP.put(1976, 0.0012207837100876406);
        RATIO_MAP.put(1977, 0.0011505130835333078);
        RATIO_MAP.put(1978, 0.001197566633061784);
        RATIO_MAP.put(1979, 0.0012122435107953257);
        RATIO_MAP.put(1980, 0.0011749369088950405);
        RATIO_MAP.put(1981, 0.0008878658215868802);
        RATIO_MAP.put(1982, 0.0007482697088439593);
        RATIO_MAP.put(1983, 0.0006624491180525008);
        RATIO_MAP.put(1984, 0.0005729384812479867);
        RATIO_MAP.put(1985, 0.000527558459729838);
        RATIO_MAP.put(1986, 0.0006745275712884319);
        RATIO_MAP.put(1987, 0.000774652797445337);
        RATIO_MAP.put(1988, 0.0007726011367116883);
        RATIO_MAP.put(1989, 0.0007326931869648831);
        RATIO_MAP.put(1990, 0.0008377852185568999);
        RATIO_MAP.put(1991, 0.0008072464808495754);
        RATIO_MAP.put(1992, 0.0008140956982619976);
        RATIO_MAP.put(1993, 0.0006372040317900358);
        RATIO_MAP.put(1994, 0.0006204425971064185);
        RATIO_MAP.put(1995, 0.0006141043581404476);
        RATIO_MAP.put(1996, 0.000648031975072214);
        RATIO_MAP.put(1997, 0.0005876563105334064);
        RATIO_MAP.put(1998, 0.0005763375056561751);
    }
}
