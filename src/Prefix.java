import java.util.Random;

/**
 * @author Jamal Kamareddine
 * 
 * All possible planet name prefixes
 */
public class Prefix {
    private static final String[][] prefixes = {
        {
            "Ab",
            "Abd",
            "Abs",
            "Abth",
            "Abz",
            "Ad",
            "Adv",
            "Aeg",
            "Aegl",
            "Aet",
            "Aeth",
            "Aev",
            "Ag",
            "Agb",
            "Agn",
            "Agr",
            "Agv",
            "Aj",
            "Ak",
            "Akr",
            "Akv",
            "Al",
            "Alcy",
            "Ald",
            "Alg",
            "Alph",
            "Alt",
            "Am",
            "Amph",
            "Amr",
            "An",
            "Anc",
            "And",
            "Andr",
            "Angl",
            "Ankt",
            "Ans",
            "Ant",
            "Anth",
            "Anthr",
            "Antl",
            "Ap",
            "Aph",
            "Aphr",
            "Aqu",
            "Ar",
            "Arc",
            "Arct",
            "Ard",
            "Arg",
            "Arm",
            "Art",
            "Arth",
            "Arv",
            "Arx",
            "As",
            "Asg",
            "Ash",
            "Askl",
            "Astr",
            "Ath",
            "Athr",
            "Atl",
            "Atm",
            "Atr",
            "Audr",
            "Aur",
            "Auv",
            "Av",
            "Ax",
            "Az",
            "Azr",
            "Azt",
        },
        {
            "B",
            "Bl",
            "Br",
        },
        {
            "C",
            "Ch",
            "Chl",
            "Chr",
            "Cr",
        },
        {
            "D",
            "Dr",
        },
        {
            "Eb",
            "Ebl",
            "Ech",
            "Eck",
            "Ecl",
            "Ect",
            "Ed",
            "Ehw",
            "Ej",
            "Ekn",
            "Ekt",
            "El",
            "Eldr",
            "Elp",
            "Elr",
            "Elv",
            "Emb",
            "Emp",
            "Emr",
            "En",
            "Enc",
            "End",
            "Enr",
            "Ens",
            "Ent",
            "Entr",
            "Enz",
            "Eogr",
            "Eos",
            "Eov",
            "Ep",
            "Eph",
            "Epr",
            "Eps",
            "Equ",
            "Er",
            "Erph",
            "Eryth",
            "Eth",
            "Euch",
            "Eucl",
            "Eun",
            "Euph",
            "Eur",
            "Euryb",
            "Eurym",
            "Euryt",
            "Ev",
            "Ex",
            "Ez",
            "Ezr",
        },
        {
            "F",
            "Fl",
            "Fr",
        },
        {
            "G",
            "Gl",
            "Gr",
        },
        {
            "H",
        },
        {
            "Ib",
            "Ibr",
            "Ic",
            "Ig",
            "Ign",
            "Igr",
            "Ikr",
            "Ill",
            "In",
            "Ind",
            "Ingw",
            "Inv",
            "Iob",
            "Ion",
            "Ioph",
            "Ip",
            "Iph",
            "Ipl",
            "Ips",
            "Ir",
            "Is",
            "It",
            "Iv",
            "Iw",
            "Ix",
            "Iz",
        },
        {
            "J",
            "Jh",
        },
        {
            "K",
            "Kh",
            "Kl",
            "Kr",
        },
        {
            "L",
        },
        { 
            "M",
        },
        {
            "N",
        },
        {
            "Ob",
            "Obs",
            "Oc",
            "Ocr",
            "Oct",
            "Octh",
            "Od",
            "Og",
            "Ogd",
            "Ogl",
            "Ogn",
            "Ogr",
            "Ohk",
            "Oj",
            "Ok",
            "Okr",
            "Olv",
            "Om",
            "Omn",
            "On",
            "Onc",
            "Ond",
            "Oor",
            "Op",
            "Oph",
            "Opt",
            "Or",
            "Orb",
            "Org",
            "Orgl",
            "Orl",
            "Orn",
            "Orph",
            "Orth",
            "Orv",
            "Os",
            "Ost",
            "Ostr",
            "Ot",
            "Oth",
            "Ov",
            "Ovn",
            "Our",
            "Ox",
            "Oz",
        },
        {
            "P",
            "Ph",
            "Phl",
            "Pl",
            "Pr",
        },
        {
            "Qu",
        },
        {
            "R",
            "Rh",
        },
        {
            "S",
            "Sc",
            "Sh",
            "Shr",
            "Sk",
            "Skl",
            "Sl",
            "Sp",
            "Sph",
            "Spl",
            "St",
            "Str",
        },
        {
            "T",
            "Th",
            "Thr",
            "Tr",
        },
        { 
            "Ub",
            "Ud",
            "Ug",
            "Ukl",
            "Ukr",
            "Ul",
            "Ulg",
            "Ultr",
            "Ulv",
            "Umb",
            "Umbr",
            "Un",
            "Undr",
            "Uobr",
            "Ups",
            "Ur",
            "Urgl",
            "Urkl",
            "Urs",
            "Ut",
            "Uv",
            "Ux",
            "Uz",
        },
        {
            "V",
            "Vl",
            "Vr",
        },
        {
            "W",
        },
        {
            "X",
            "Xh",
        },
        { 
            "Y",
            "Yh",
        },
        {
            "Z",
            "Zh",
        },
        { // More complex prefixes, separated to prevent bloat in each letter
            "Cryx",
            "Cy",
            "Cyg",
            "Cygn",
            "Cyr",
            "Cyz",
            "Fyr",
            "Hybr",
            "Hyd",
            "Hydr",
            "Hyg",
            "Hym",
            "Hyp",
            "Hyr",
            "Hyst",
            "Krypt",
            "Ky",
            "Kyd",
            "Kyl",
            "Kys",
            "Ly",
            "Lyg",
            "Lyk",
            "Lyr",
            "Myc",
            "Myth",
            "Nyct",
            "Nyr",
            "Phyb",
            "Phyl",
            "Phyt",
            "Plyg",
            "Plyth",
            "Psy",
            "Pyg",
            "Pyl",
            "Pyr",
            "Pyth",
            "Pyx",
            "Ry",
            "Ryl",
            "Ryn",
            "Scy",
            "Syr",
            "Syph",
            "Thyl",
            "Tyg",
            "Tym",
            "Typh",
            "Typhl",
            "Tyr",
            "Tyth",
            "Tyx",
            "Vyk",
            "Wy",
            "Xyl",
            "Xyk",
            "Xyn",
            "Xynth",
            "Xyr",
            "Xyv",
            "Zy",
            "Zyg",
            "Zyk",
            "Zyl",
            "Zynf",
            "Zynt",
            "Zyr",
            "Zyth",
            "Zyv",
        },
    };

    /**
     * Gets a random prefix from the above array
     * 
     * @return The prefix
     */
    public static String getPrefix() {
        Random rand = new Random();
        String[] letter = prefixes[rand.nextInt(prefixes.length)];
        String prefix = letter[rand.nextInt(letter.length)];

        return prefix;
    }

    /**
     * Gets the amount of total prefixes
     * 
     * @return The total number of possible prefixes
     */
    public static int getNumPrefixes() {
        int numPrefixes = 0;

        for (int i = 0; i < prefixes.length; i++) {
            numPrefixes += prefixes[i].length;
        }

        return numPrefixes;
    }
}
