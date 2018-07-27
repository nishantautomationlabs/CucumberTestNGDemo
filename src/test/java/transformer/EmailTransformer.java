package transformer;

import Base.Util;
import cucumber.api.Transformer;

public class EmailTransformer extends Transformer<String> {

    @Override
    public String transform(String s) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String randomStr = Util.generateData(5, chars);
        return s.concat("_").concat(randomStr).concat("@gmail.com");
    }



}
