package nu.hex.mediatype.mtd2java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import nu.hex.mediatype.Main;

/**
 *
 * @author hln
 */
public class MtdParser {

    private final String target;
    private static final String HEX_MEDIA_TYPE_NAME = "HexMediaType";
    private final SourceProvider provider = new SourceProvider();

    public MtdParser(String target) {
        this.target = target != null ? target : HEX_MEDIA_TYPE_NAME;
    }

    public String parse() throws IOException {
        InputStream stream = target.equals(HEX_MEDIA_TYPE_NAME) ? provider.getHexMediaTypesSource() : provider.getCommonMediaTypesSource();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream, Main.MTD_ENCODING));
        StringBuilder interfaceBuilder = openInterfaceBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.startsWith("MediaType")) {
                addToInterfaceBuilder(line, interfaceBuilder);
            }
        }
        String interfaceString = closeInterfaceBuilder(interfaceBuilder);
        return interfaceString;
    }

    private StringBuilder openInterfaceBuilder() {
        StringBuilder interfaceBuilder = new StringBuilder("package nu.hex.mediatype;\n\n")
                .append("/**\n")
                .append(" *\n")
                .append(" * DO NOT MODIFY! This interface is autogenerated.\n")
                .append(" *\n")
                .append(" * Changes done here will be owerwritten the next time the project runs.\n")
                .append(" *\n")
                .append(" * To add mediatypes or edit them, run this project and use the editor.\n")
                .append(" *\n")
                .append(" * If the MTD is manually edited, run the project and use the update button.\n")
                .append(" *\n")
                .append(" * To remove a mediatype, remove it manually from the MTD file.\n")
                .append(" *\n")
                .append(" */\n")
                .append("public interface ")
                .append(target)
                .append(" {\n\n");
        return interfaceBuilder;
    }

    private void addToInterfaceBuilder(String line, StringBuilder interfaceBuilder) {
        String[] keyValues = line.split(";");
        String key = keyValues[0];
        String suffix = "";
        interfaceBuilder.append("    /**\n");
        if (keyValues.length > 1) {
            if (keyValues[1] != null) {
                suffix = keyValues[1];
            }
        }
        if (keyValues.length > 2 && keyValues[2] != null) {
            for (int i = 2; i < keyValues.length; i++) {
                interfaceBuilder.append("     * ")
                        .append(keyValues[i].trim()).append("<br>\n")
                        .append("     *\n");
            }
        }
        interfaceBuilder.append("     * <br>\n     * MediaType: <i>")
                .append(key).append("</i>\n");
        if (!suffix.equals("")) {
            interfaceBuilder.append("     * <br>\n     * FileSuffix: <i>");
            String[] suffices = suffix.split(",");
            int i = 0;
            for (String s : suffices) {
                if (i++ > 0) {
                    interfaceBuilder.append(", ");
                }
                interfaceBuilder.append(".").append(s.trim());
            }
            interfaceBuilder.append("</i>\n");
        }
        interfaceBuilder.append("     */\n");
        interfaceBuilder.append("    public static final String ")
                .append(convertToConstant(key))
                .append(" = \"").append(key).append("\";\n");
    }

    private String closeInterfaceBuilder(StringBuilder interfaceBuilder) {
        interfaceBuilder.append("}\n");
        String interfaceString = interfaceBuilder.toString();
        return interfaceString;
    }

    private String convertToConstant(String key) {
        return key.replaceAll("[^a-zA-Z0-9]", "_").toUpperCase();
    }

    private class SourceProvider {

        public InputStream getHexMediaTypesSource() {
            String resource = "HexMediaTypes.mtd";
            return getClass().getClassLoader().getResourceAsStream(resource);
        }

        public InputStream getCommonMediaTypesSource() {
            String resource = "CommonMediaTypes.mtd";
            return getClass().getClassLoader().getResourceAsStream(resource);
        }
    }
}
