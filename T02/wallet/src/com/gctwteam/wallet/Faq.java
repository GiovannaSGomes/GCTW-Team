package com.gctwteam.wallet;

public class Faq {
    private String title;
    private String description;
    private String answer;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    @Override
    public String toString() {
    	return title + "\n\n"
    			+ "Pergunta: " + description + "\n"
    			+ "Resposta: " + answer + "\n";
    }
}
