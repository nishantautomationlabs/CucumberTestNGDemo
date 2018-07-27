package transformer;

import Base.Util;
import cucumber.api.Transformer;

public class PasswordTransformer extends Transformer<String> {


    @Override
    public String transform(String s) {
        String chars = "A1B2C3D4E5F6G7H8I9JKLMNOPQRSTUVWXYZ0";
        String randomPwd = Util.generateData(Integer.valueOf(s), chars);
        return randomPwd;

    }
}
