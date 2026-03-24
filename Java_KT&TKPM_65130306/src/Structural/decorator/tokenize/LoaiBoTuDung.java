package Structural.decorator.tokenize;

import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
    List<String> tuDung = List.of("thì", "mà", "là", "vì", "nên", "và", "quá", "nhưng");
    public LoaiBoTuDung(ITokenize token) {
        super(token);
    }

    @Override
    public List<String> tokennize() {
        List<String> t = super.tokennize();
        t.removeAll(tuDung);
        return t;
    }
}
