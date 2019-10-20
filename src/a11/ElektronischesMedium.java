package a11;

public class ElektronischesMedium extends Medium {

    private String url;


    public ElektronischesMedium(String _titel, String _url) {
        super(_titel);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String calculateRepresentation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titel: "+this.getTitel()).append(" ")
                .append("URL: " + this.getUrl());
        return sb.toString();
    }
}
