package Structural.decorator.tokenize;

public class MainTokenize {
    public static void main(String[] args){
        ITokenize token = new TachTu("Lớp 65CNTT-1 đoàn kết ,và học tập tốt.");
        System.out.println(token.tokennize());
        token = new LoaiBoDauCau(token);
        System.out.println(token.tokennize());
        token = new LoaiBoTuDung(token);
        System.out.println(token.tokennize());
    }
}
