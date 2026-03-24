package Structural.decorator.tokenize;

import java.util.ArrayList;
import java.util.List;

public class LoaiBoDauCau extends TokenDecorator{
    public LoaiBoDauCau(ITokenize token){
        super(token);
    }

    @Override
    public List<String> tokennize() {
        List<String> list = super.tokennize();
        List<String> result = new ArrayList<>();
        for (var s : list)
            result.add(s.replaceAll("[\\p{Punct}]", ""));
        return result;
    }
}
