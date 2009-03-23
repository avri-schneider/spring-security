package org.springframework.security.config;

import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Node;

/**
 * Adds the decorated {@link org.springframework.security.afterinvocation.AfterInvocationProvider} to the
 * AfterInvocationProviderManager's list.
 *
 * @author Luke Taylor
 * @version $Id$
 * @since 2.0
 */
public class CustomAfterInvocationProviderBeanDefinitionDecorator implements BeanDefinitionDecorator {

    @SuppressWarnings("unchecked")
    public BeanDefinitionHolder decorate(Node node, BeanDefinitionHolder holder, ParserContext parserContext) {
        ConfigUtils.getRegisteredAfterInvocationProviders(parserContext).add(holder.getBeanDefinition());

        return holder;
    }

}