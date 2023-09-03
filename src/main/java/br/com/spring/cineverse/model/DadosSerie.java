package br.com.spring.cineverse.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// @JsonAlias({Pode receber um range de palavras}) , serve apenas para ler, na hora de escrever o json ele usa o nome original do atributo
// @JsonProperty() serve para ler e escrever usando a string que é passa nos parenteses
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String title,
                      @JsonAlias("Year")   String year,
                      @JsonAlias("Country") String country,
                      @JsonAlias("imdbRating") String ranting,
                      @JsonAlias("totalSeasons")   Integer totalSeasons)
{

}
