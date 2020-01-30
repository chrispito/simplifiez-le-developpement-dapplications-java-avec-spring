package org.example.demo.ticket.business.resource;

import org.example.demo.ticket.business.ManagerFactory;
import org.example.demo.ticket.model.bean.ModelBeanFactory;

public abstract class AbstractResource {
    private static ManagerFactory managerFactory;
    private static ModelBeanFactory modelBeanFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    protected static ModelBeanFactory getModelBeanFactory() {
        return modelBeanFactory;
    }

    public static void setModelBeanFactory(ModelBeanFactory modelBeanFactory) {
        AbstractResource.modelBeanFactory = modelBeanFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        managerFactory = managerFactory;
    }
}
