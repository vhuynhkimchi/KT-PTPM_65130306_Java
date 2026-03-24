package Structural.decorator.tokenize;

import java.util.List;

public class TokenDecorator implements ITokenize{
    ITokenize token;
    public TokenDecorator(ITokenize token){
        this.token = token;
    }
    public List<String> tokennize(){
        return token.tokennize();
    }
}
