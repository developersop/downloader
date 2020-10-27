/**/// DO NOT MODIFY THIS FILE MANUALLY
/**/// This class was automatically generated by "GeneratePatternClasses.java",
/**/// modify the "unique_patterns.json" and re-generate instead.

package org.schabi.newpipe.extractor.timeago.patterns;

import org.schabi.newpipe.extractor.timeago.PatternsHolder;

public class fr_CA extends PatternsHolder {
    private static final String WORD_SEPARATOR = " ";
    private static final String[]
            SECONDS  /**/ = {"seconde", "secondes"},
            MINUTES  /**/ = {"minute", "minutes"},
            HOURS    /**/ = {"heures", "heure"},
            DAYS     /**/ = {"jour", "jours"},
            WEEKS    /**/ = {"semaine", "semaines"},
            MONTHS   /**/ = {"mois"},
            YEARS    /**/ = {"an", "ans"};

    private static final fr_CA INSTANCE = new fr_CA();

    public static fr_CA getInstance() {
        return INSTANCE;
    }

    private fr_CA() {
        super(WORD_SEPARATOR, SECONDS, MINUTES, HOURS, DAYS, WEEKS, MONTHS, YEARS);
    }
}