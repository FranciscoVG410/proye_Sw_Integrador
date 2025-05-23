package reportes;

import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import static net.sf.dynamicreports.report.builder.DynamicReports.*;

public class Templates {

    public static final StyleBuilder rootStyle = stl.style().setFontSize(10);

    public static final StyleBuilder bold12CenteredStyle = stl.style(rootStyle)
        .bold()
        .setFontSize(12)
        .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);

    public static final StyleBuilder bold18CenteredStyle = stl.style(rootStyle)
        .bold()
        .setFontSize(18)
        .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);
}
