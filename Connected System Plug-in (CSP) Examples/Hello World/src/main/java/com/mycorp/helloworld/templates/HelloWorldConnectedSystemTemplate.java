package com.mycorp.helloworld.templates;

import com.appian.connectedsystems.simplified.sdk.SimpleConnectedSystemTemplate;
import com.appian.connectedsystems.simplified.sdk.configuration.SimpleConfiguration;
import com.appian.connectedsystems.templateframework.sdk.ExecutionContext;
import com.appian.connectedsystems.templateframework.sdk.TemplateId;
import com.appian.connectedsystems.templateframework.sdk.configuration.DocumentLocationPropertyDescriptor;

@TemplateId(name="HelloWorldConnectedSystemTemplate")
public class HelloWorldConnectedSystemTemplate extends SimpleConnectedSystemTemplate {

  public static final String CS_PROP_KEY = "csProp";

  @Override
  protected SimpleConfiguration getConfiguration(
      SimpleConfiguration simpleConfiguration, ExecutionContext executionContext) {

    return simpleConfiguration.setProperties(
        // Make sure you make public constants for all keys so that associated
        // integrations can easily access this field
        this.textProperty(CS_PROP_KEY)
            .label("Text Property")
            .description("blah blah blah text")
            .isExpressionable(false)
            .build()
    );
  }
}
