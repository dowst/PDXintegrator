package org.jax.pdxintegrator.model.patient;

/**
 * TODO we need to decide how to represent Age. Is it a five year bin? Is it age at diagnosis or
 * age at specimen collection?
 */
public enum Age {
    age0_4("0-4 years"),
    age5_9("5-9 years"),
    age10_14("10-14 years"),
    age15_19("15-19 years"),
    age20_24("20-24 years"),
    age25_29("25-29 years"),
    age30_34("30-34 years"),
    age35_39("35-39 years"),
    age40_44("40-44 years"),
    age45_49("45-49 years"),
    age50_54("50-54 years"),
    age55_59("55-59 years"),
    age60_64("60-64 years"),
    age65_69("65-69 years"),
    age70_74("70-74 years"),
    age75_79("75-79 years"),
    age80_84("80-84 years"),
    age85_89("85-89 years"),
    age90_94("90-94 years"),
    age95_99("95-99 years"),
    age100_104("100-104 years"),
    age105_109("105-109 years");

    private final String name;

    Age(String n) {
        name=n;
    }

    public String getAgeString(){ return name; }

    public int getLower() {
        switch (this) {
            case age0_4: return 0;
            case age5_9: return 5;
            case age10_14:return 10;
            case age15_19:return 15;
            case age20_24:return 20;
            case age25_29:return 25;
            case age30_34:return 30;
            case age35_39:return 35;
            case age40_44:return 40;
            case age45_49:return 45;
            case age50_54:return 50;
            case age55_59:return 55;
            case age60_64:return 60;
            case age65_69:return 65;
            case age70_74:return 70;
            case age75_79:return 75;
            case age80_84:return 80;
            case age85_89:return 85;
            case age90_94:return 90;
            case age95_99:return 95;
            case age100_104:return 100;
            case age105_109:return 105;
        }
        // we should never get here
        return 0;
    }

    public int getUpper() {
        switch (this) {
            case age0_4: return 4;
            case age5_9: return 9;
            case age10_14:return 14;
            case age15_19:return 19;
            case age20_24:return 24;
            case age25_29:return 29;
            case age30_34:return 34;
            case age35_39:return 39;
            case age40_44:return 44;
            case age45_49:return 49;
            case age50_54:return 54;
            case age55_59:return 59;
            case age60_64:return 64;
            case age65_69:return 69;
            case age70_74:return 74;
            case age75_79:return 79;
            case age80_84:return 84;
            case age85_89:return 89;
            case age90_94:return 94;
            case age95_99:return 99;
            case age100_104:return 104;
            case age105_109:return 109;
        }
        // we should never get here
        return 109;
    }



}
