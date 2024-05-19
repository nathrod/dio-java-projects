package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> contentInitiaded = new LinkedHashSet<>();
    private Set<Content> contentsDone = new LinkedHashSet<>();

    public void enrollBootcamp(Bootcamp bootcamp){
        this.contentInitiaded.addAll(bootcamp.getContents());
        bootcamp.getDevSubscribe().add(this);
    }
    public void progress(){
        Optional<Content> content = this.contentInitiaded.stream().findFirst();
        if(content.isPresent()){
            this.contentsDone.add(content.get());
            this.contentInitiaded.remove(content.get());
        }else {
            System.out.println("You are not enroll in any content");
        }
    }
    public double calculateTotalXp(){
        return this.contentsDone.stream().mapToDouble(Content::calculateXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentInitiaded() {
        return contentInitiaded;
    }

    public void setContentInitiaded(Set<Content> contentInitiaded) {
        this.contentInitiaded = contentInitiaded;
    }

    public Set<Content> getContentsDone() {
        return contentsDone;
    }

    public void setContentsDone(Set<Content> contentsDone) {
        this.contentsDone = contentsDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getName(), dev.getName()) && Objects.equals(getContentInitiaded(), dev.getContentInitiaded()) && Objects.equals(getContentsDone(), dev.getContentsDone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getContentInitiaded(), getContentsDone());
    }
}
