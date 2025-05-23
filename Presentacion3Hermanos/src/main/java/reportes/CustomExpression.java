package reportes;

import net.sf.dynamicreports.report.definition.ReportParameters;
import net.sf.dynamicreports.report.base.expression.AbstractSimpleExpression;
import net.sf.dynamicreports.report.constant.Calculation;

public class CustomExpression<T> extends AbstractSimpleExpression<T> {

    private final String fieldName;
    private final boolean isSum;
    private final Calculation calculation;

    public CustomExpression(String fieldName, boolean isSum, Calculation calculation) {
        this.fieldName = fieldName;
        this.isSum = isSum;
        this.calculation = calculation;
    }

    @Override
    public T evaluate(ReportParameters reportParameters) {
        return reportParameters.getValue(fieldName);
    }

    public Calculation getCalculation() {
        return calculation;
    }
}
