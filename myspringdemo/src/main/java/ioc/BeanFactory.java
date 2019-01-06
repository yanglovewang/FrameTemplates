package ioc;

import java.util.List;

public class BeanFactory {

    private BeanDifined beanDifined;
    private List<BeanDifined> beanDifineds;

    public List<BeanDifined> getBeanDifineds() {
        return beanDifineds;
    }

    public void setBeanDifined(BeanDifined beanDifined) {
        this.beanDifined = beanDifined;
    }

    public void setBeanDifineds(List<BeanDifined> beanDifineds) {
        this.beanDifineds = beanDifineds;
    }

    public Object getBean(String id) throws Exception {
        Object o = null;
        for (BeanDifined b : beanDifineds) {
            if (b.getBeanId().equals(id)) {
                String classPath = b.getBeanClassPath();
                Class calssFile = Class.forName(classPath);
                o = calssFile.newInstance();
            } else {
                System.out.println("no bean");
            }
        }
        return o;
    }

}
