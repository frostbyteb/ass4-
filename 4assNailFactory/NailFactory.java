// NailFactory for creating different nail designs
public class NailFactory {
    public NailDesign createNailDesign(String designType) {
        if (designType.equalsIgnoreCase("FrenchManicure")) {
            return new FrenchManicure();
        } else if (designType.equalsIgnoreCase("GelNails")) {
            return new GelNails();
        } else if (designType.equalsIgnoreCase("AcrylicNails")) {
            return new AcrylicNails();
        } else {
            throw new IllegalArgumentException("Invalid nail design type.");
        }
    }
}