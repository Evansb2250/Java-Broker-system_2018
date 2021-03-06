//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.22 at 03:22:23 PM GMT 
//


package AccountDetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loggedOn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myShare" type="{http://xml.netbeans.org/schema/Consumer}listOfShares"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userID", propOrder = {
    "userName",
    "password",
    "loggedOn",
    "myShare"
})
public class UserID {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(defaultValue = "false")
    protected boolean loggedOn;
    @XmlElement(required = true)
    protected ListOfShares myShare;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the loggedOn property.
     * 
     */
    public boolean isLoggedOn() {
        return loggedOn;
    }

    /**
     * Sets the value of the loggedOn property.
     * 
     */
    public void setLoggedOn(boolean value) {
        this.loggedOn = value;
    }

    /**
     * Gets the value of the myShare property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfShares }
     *     
     */
    public ListOfShares getMyShare() {
        return myShare;
    }

    /**
     * Sets the value of the myShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfShares }
     *     
     */
    public void setMyShare(ListOfShares value) {
        this.myShare = value;
    }

}
