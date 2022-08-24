package garbageCollector;

public class ReferenceCounting {
    public static void main(String[] args) {

        Sample s ; // stack-da s referansi yaradildi
        s= new Sample(); // heapde s referance-nin gosterdiyi obyekt yarandi

        {
            Sample k = s; // stackde olan k referansida heap-de eyni obyektu gosterir
            Mample.foo(s);

        }
        Runtime.getRuntime().gc();
        Sample sample = new Sample();
        // Yuxaridaki Sample objeleri kill oldu
        s = new Sample();


    }
}

class Sample{


}

class Mample{

    public static void foo(Sample s){

        Sample k = s;

    }
}
