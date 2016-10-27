package nu.hex.story.manager.util.currency.convert;

/**
 * Created 2016-okt-23
 *
 * @author hl
 */
public class AlbanianLeiToUSDollarConverter extends AbstractDollarConverter {

    public AlbanianLeiToUSDollarConverter(Integer year) {
        super(year, 1927, 2015);
    }

    static {
        RATIO_MAP.put(1927, 0.19284294234592445);
        RATIO_MAP.put(1928, 0.19299999999999956);
        RATIO_MAP.put(1929, 0.19277108433734955);
        RATIO_MAP.put(1930, 0.1933867735470944);
        RATIO_MAP.put(1931, 0.19321357285429194);
        RATIO_MAP.put(1932, 0.19262213359920305);
        RATIO_MAP.put(1933, 0.30211267605633935);
        RATIO_MAP.put(1934, 0.32613521695257397);
        RATIO_MAP.put(1935, 0.3255276381909556);
        RATIO_MAP.put(1936, 0.3267465069860279);
        RATIO_MAP.put(1937, 0.32937625754527267);
        RATIO_MAP.put(1938, 0.3299697275479316);
        RATIO_MAP.put(1939, 0.31728643216080404);
        RATIO_MAP.put(1940, -0.04076479076479081);
        RATIO_MAP.put(1941, -0.04076479076479081);
        RATIO_MAP.put(1942, -0.04076479076479081);
        RATIO_MAP.put(1943, -0.04076479076479081);
        RATIO_MAP.put(1944, -0.04076479076479081);
        RATIO_MAP.put(1945, -0.04076479076479081);
        RATIO_MAP.put(1946, 0.06141112380151094);
        RATIO_MAP.put(1947, 0.07888620653929036);
        RATIO_MAP.put(1948, 0.04124354827453467);
        RATIO_MAP.put(1949, -0.03668792218852768);
        RATIO_MAP.put(1950, -0.028275028275028286);
        RATIO_MAP.put(1951, -0.028275028275028286);
        RATIO_MAP.put(1952, -0.028286387399868083);
        RATIO_MAP.put(1953, -0.028320077485181214);
        RATIO_MAP.put(1954, 0.03432061067745943);
        RATIO_MAP.put(1955, 0.02965347783321659);
        RATIO_MAP.put(1956, 0.021236573897996564);
        RATIO_MAP.put(1957, 0.01761597234144786);
        RATIO_MAP.put(1958, 0.01581245411213636);
        RATIO_MAP.put(1959, 0.016943327688159218);
        RATIO_MAP.put(1960, 0.017892929374201248);
        RATIO_MAP.put(1961, 0.01802596957380234);
        RATIO_MAP.put(1962, 0.015503434386312645);
        RATIO_MAP.put(1963, 0.014386536213024935);
        RATIO_MAP.put(1964, 0.012561007666514329);
        RATIO_MAP.put(1965, 0.012539103485612445);
        RATIO_MAP.put(1966, 0.012574973632310674);
        RATIO_MAP.put(1967, 0.013985528475921959);
        RATIO_MAP.put(1968, 0.017313976144475714);
        RATIO_MAP.put(1969, 0.017372726084341962);
        RATIO_MAP.put(1970, 0.016914959935258045);
        RATIO_MAP.put(1971, 0.018144204490236505);
        RATIO_MAP.put(1972, 0.024309225184838242);
        RATIO_MAP.put(1973, 0.028549501738593882);
        RATIO_MAP.put(1974, 0.02893598885703059);
        RATIO_MAP.put(1975, 0.0287165755309362);
        RATIO_MAP.put(1976, 0.027862690717341456);
        RATIO_MAP.put(1977, 0.026106030174167183);
        RATIO_MAP.put(1978, 0.024884297253812783);
        RATIO_MAP.put(1979, 0.028715681176554028);
        RATIO_MAP.put(1980, 0.02492250405647073);
        RATIO_MAP.put(1981, 0.025179861857145838);
        RATIO_MAP.put(1982, 0.02013792219069314);
        RATIO_MAP.put(1983, 0.031055137963707864);
        RATIO_MAP.put(1984, 0.02807652841969888);
        RATIO_MAP.put(1985, 0.026019494710253707);
        RATIO_MAP.put(1986, 0.025626298140512767);
        RATIO_MAP.put(1987, 0.02481836641942897);
        RATIO_MAP.put(1988, 0.0266270321847326);
        RATIO_MAP.put(1989, 0.020446904480865048);
        RATIO_MAP.put(1990, 0.011096191745620985);
        RATIO_MAP.put(1991, 0.012576298646226391);
        RATIO_MAP.put(1992, 0.0067524390950694825);
        RATIO_MAP.put(1993, 0.007732749223094357);
        RATIO_MAP.put(1994, 0.008695325036314885);
        RATIO_MAP.put(1995, 0.009726640325647011);
        RATIO_MAP.put(1996, 0.009572181462387126);
        RATIO_MAP.put(1997, 0.0067162594752727635);
        RATIO_MAP.put(1998, 0.006638985476561486);
        RATIO_MAP.put(1999, 0.007263430814536139);
        RATIO_MAP.put(2000, 0.006966694780784291);
        RATIO_MAP.put(2001, 0.006971511664054263);
        RATIO_MAP.put(2002, 0.007144282476801715);
        RATIO_MAP.put(2003, 0.00820789142591122);
        RATIO_MAP.put(2004, 0.009731709227614856);
        RATIO_MAP.put(2005, 0.010018823273488396);
        RATIO_MAP.put(2006, 0.010200474092383793);
        RATIO_MAP.put(2007, 0.011061489969893286);
        RATIO_MAP.put(2008, 0.01195754421759366);
        RATIO_MAP.put(2009, 0.010553860687801403);
        RATIO_MAP.put(2010, 0.009622863176472986);
        RATIO_MAP.put(2011, 0.009913346120097796);
        RATIO_MAP.put(2012, -0.01600263341267566);
        RATIO_MAP.put(2013, -0.015795504941958687);
        RATIO_MAP.put(2014, -0.016632045110981212);
        RATIO_MAP.put(2015, -0.015443348721356972);
    }
}