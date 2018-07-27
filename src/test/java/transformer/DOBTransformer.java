package transformer;

import Base.Util;
import cucumber.api.Transformer;

import java.util.Date;

public class DOBTransformer extends Transformer<Date> {

    @Override
    public Date transform(String s) {
        return Util.getDateFromString(s, "dd-MMM-yyyy");
    }
}
