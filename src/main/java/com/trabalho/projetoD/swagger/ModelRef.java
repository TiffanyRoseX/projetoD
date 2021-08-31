package com.trabalho.projetoD.swagger;

import springfox.documentation.schema.ModelReference;
import springfox.documentation.service.AllowableValues;

import java.util.Optional;

public class ModelRef implements ModelReference {
    public ModelRef(String string) {
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public Optional<String> getTypeSignature() {
        return Optional.empty();
    }

    @Override
    public boolean isCollection() {
        return false;
    }

    @Override
    public boolean isMap() {
        return false;
    }

    @Override
    public String getItemType() {
        return null;
    }

    @Override
    public AllowableValues getAllowableValues() {
        return null;
    }

    @Override
    public Optional<ModelReference> itemModel() {
        return Optional.empty();
    }

    @Override
    public Optional<String> getModelId() {
        return Optional.empty();
    }

    public void parameterType(String header) {
    }
}
