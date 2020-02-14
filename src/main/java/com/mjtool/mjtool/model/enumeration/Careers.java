package com.mjtool.mjtool.model.enumeration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum Careers {


    AGITATEUR("Agitateur", true, false),
    APPRENTI_SORCIER("Apprenti sorcier", true, false),
    ARTISAN("Artisan", true, false),
    BATELIER("Batelier", true, false),
    BERSERK_NORSE("Berserk Norse", true, false),
    BOURGEOIS("Bourgeois", true, false),
    BUCHERON("Bucheron", true, false),
    CHARBONNIER("Charbonnier", true, false),
    CHASSEUR("Chasseur", true, false),
    CHASSEUR_DE_PRIMES("Chasseur de primes", true, false),
    CHIFFONNIER("Chiffonnier", true, false),
     CHIRURGIEN_BARBIER("Chirurgien barbier", true, false),
    COCHER("Cocher", true, false),
    COLLECTEUR_TAXES("Collecteur de taxes", true, false),
    COMBATTANT_TUNNELS("Combattant des tunnels", true, false),
    CONTREBANDIER("Contrebandier", true, false),
    COUPE_JARRET("Coupe-jarret", true, false),
    DIESTRO_ESTALIEN("Diestro Estalien", true, false),
    ECLAIREUR("Eclaireur", true, false),
    ECUYER("Ecuyer", true, false),
    EMISSAIRE_ELFE("Emissaire Elfe", true, false),
    ESCROC("Escroc", true, false),
    ETUDIANT("Etudiant", true, false),
    FANATIQUE("Fanatique", true, false),
    GARDE("Garde", true, false),
    GARDE_CORPS("Garde du corps", true, false),
    GARDIEN_TRIBAL("Gardien tribal", true, false),
    GEOLIER("G>eolier", true, false),
    GLADIATEUR("Gladiateur", true, false),
    HORS_LA_LOI("Hors-la-loi", true, false),
    INITIE("Initié", true, false),
    KOSSAR_KISLEVITE("Kossar Kislevite", true, false),
    MARIN("Marin", true, false),
    MATELOT("Matelot", true, false),
    MERCANTI("Mercanti", true, false),
    MERCENAIRE("Mercenaire", true, false),
    MESSAGER("Messager", true, false),
    MILICIEN("Milicien", true, false),
    MINEUR("Mineur", true, false),
    NOBLE("Noble", true, false),
    PASSEUR("Passeur", true, false),
    PATROUILLEUR("Patrouilleur", true, false),
    PAYSAN("Paysan", true, false),
    PECHEUR("Pecheur", true, false),
    PILLEUR_TOMBES("Pilleur de tombes", true, false),
    PORTERUNE("Porterune", true, false),
    REGISSEUR("Regisseur", true, false),
    SCRIBE("Scribe", true, false),
    SENTINELLE_HALFLING("Sentinelle Halfling", true, false),
    SERVITEUR("Serviteur", true, false),
    SOLDAT("Soldat", true, false),
    SORCIER_VILLAGE("Sorcier de village", true, false),
    SPADASSIN("Spadassin", true, false),
    TRAFIQUANT_CADAVRES("Trafiquant de cadavres", true, false),
    TUEUR_TROLLS("Tueur de trolls", true, false),
    VAGABOND("Vagabond", true, false),
    VALET("Valet", true, false),
    VOLEUR("Voleur", true, false),

    ARISTOCRATE("Aristocrate", false, true),
    ASSASSIN("Assassin", false, true),
    AUBERGISTE("Aubergiste", false, true),
    BANDIT_GRAND_CHEMIN("Bandit de grand chemin", false, true),
    BOURREAU("Bourreau", false, true),
    CAPITAINE("Capitaine", false, true),
    CAPITAINE_NAVIRE("Capitaine de navire", false, true),
    CHAMPION("Champion", false, true),
    CHAMPION_JUSTICE("Champion de justice", false, true),
    CHARLATAN("Charlatan", false, true),
    CHASSEUR_VAMPIRES("Chasseur de vampires", false, true),
    CHEF_BANDE("Chef de bande", false, true),
    CHEVALIER("Chevalier", false, true),
    CHEVALIER_CERCLE_INTERIEUR("Chevalier du cercle intérieur", false, true),
    COMPAGNON_SORCIER("Compagnon sorcier", false, true),
    COURTISAN("Courtisan", false, true),
    DEMAGOGUE("Démagogue", false, true),
    DUELLISTE("Duelliste", false, true),
    ERUDIT("Erudit", false, true),
    ESPION("Espion", false, true),
    EXPLORATEUR("Explorateur", false, true),
    FLAGELLANT("Flagellant", false, true),
    FRANC_ARCHER("Franc archer", false, true),
    GRAND_PRETRE("Grand prêtre", false, true),
    HERAUT("Heraut", false, true),
    INGENIEUR("Ingénieur", false, true),
    INTENDANT("Intendant", false, true),
    MAITRE_ARTISAN("Maitre artisan", false, true),
    MAITRE_GUILDE("Maitre de guilde", false, true),
    MAITRE_SORCIER("Maitre sorcier", false, true),
    MARCHAND("Marchand", false, true),
    MEDECIN("Médecin", false, true),
    MENESTREL("Menestrel", false, true),
    MOINE("Moine", false, true),
    MONTE_EN_AIR("Monte en l'air", false, true),
    NAVIGATEUR("Navigateur", false, true),
    OFFICIER_SECOND("Officier en second", false, true),
    PISTEUR("Pisteur", false, true),
    PISTOLIER("Pistolier", false, true),
    POLITICIEN("Politicien", false, true),
    PRETRE("Prêtre", false, true),
    PRETRE_CONSACRE("Prêtre consacré", false, true),
    PRINCE_VOLEURS("Prince des voleurs", false, true),
    RACKETTEUR("Racketteur", false, true),
    RECELEUR("Receleur", false, true),
    REPURGATEUR("Répurgateur", false, true),
    RODEUR_FANTOME("Rôdeur fantôme", false, true),
    SEIGNEUR_SORCIER("Seigneur sorcier", false, true),
    SERGENT("Sergent", false, true),
    TUEUR_DEMONS("Tueur de démons", false, true),
    TUEUR_GEANTS("Tueur de géants", false, true),
    VETERAN("Vétéran", false, true);


    private String name;
    private Boolean isBasic;
    private Boolean isAdvanced;
    private String value;

    Careers(String value, Boolean isBasic, Boolean isAdvanced) {
        this.isBasic = isBasic;
        this.isAdvanced = isAdvanced;
        this.value = value;
        name = name();
    }

    public Boolean getBasic() {
        return isBasic;
    }

    public void setBasic(Boolean basic) {
        isBasic = basic;
    }

    public Boolean getAdvanced() {
        return isAdvanced;
    }

    public void setAdvanced(Boolean advanced) {
        isAdvanced = advanced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
