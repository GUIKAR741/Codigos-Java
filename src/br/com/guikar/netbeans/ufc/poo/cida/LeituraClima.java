package br.com.guikar.netbeans.ufc.poo.cida;

public class LeituraClima {
    private float tempMax;
    private float tempMin;

    public LeituraClima(float tempMax, float tempMin) {
        if(tempMax!=0)
            this.tempMax = tempMax;
        if(tempMin!=0)
            this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public float getTempMin() {
        return tempMin;
    }
}
