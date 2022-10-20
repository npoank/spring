package org.spring;

public class ClassicMusic implements Music {

    // factory-method
    private ClassicMusic(){}

    public static ClassicMusic getObjClassMusic(){
        return new ClassicMusic();
    }

    // init-method
    public void initBean() {
        System.out.println("Initialization bean");
    }

    //destroy-method
    public void destrBean() {
        System.out.println("Destruction bean");
    }

    @Override
    public String getSong() {
        return "some classical music";
    }
}
