package org.example;
// By Implementing this, it means that all my validators MUST return this boolean isValid
public interface UENValidator {
    boolean isValid(String uen);
}