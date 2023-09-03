package br.com.spring.cineverse.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
