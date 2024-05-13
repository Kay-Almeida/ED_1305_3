package models;

public class Chocolate {
    private double volume;

    public Chocolate(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Chocolate\nVolume = " + volume + " cm3\nTipo = " + getUtilidade();
    }

    @Override
    public int hashCode() {
        if (volume >= 50 && volume <= 60) {
            return 0;
        } else if (volume >= 100 && volume <= 110) {
            return 1;
        } else if (volume >= 150 && volume <= 165) {
            return 2;
        } else if (volume >= 200 && volume <= 220) {
            return 3;
        } else if (volume >= 260 && volume <= 280) {
            return 4;
        }
        return -1;
    }

    public String getUtilidade() {
        switch (hashCode()) {
            case 0:
                return "Para Bombons";
            case 1:
                return "Para Pavês";
            case 2:
                return "Para Brigadeiros";
            case 3:
                return "Para Bolos";
            case 4:
                return "Para Ovos de Páscoa";
            default:
                return "Tipo inválido";
        }
    }
}