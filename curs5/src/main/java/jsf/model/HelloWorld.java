package jsf.model; /**
 * Created by Mucefix on 21/11/16.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {

    @ManagedProperty(value="#{message}")
    private Message messageBean;

    private String message;

    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }
    public String getMessage() {
        if(messageBean != null){
            message = messageBean.getMessage();
        }
        return message;
    }
    public void setMessageBean(Message message) {
        this.messageBean = message;
    }
}
