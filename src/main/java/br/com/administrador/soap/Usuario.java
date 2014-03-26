
package br.com.administrador.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="imagem01" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="imagem02" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="imagem03" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="imagem04" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "cpf",
    "email",
    "id",
    "imagem01",
    "imagem02",
    "imagem03",
    "imagem04",
    "nome",
    "tif"
})
public class Usuario {

    protected String cpf;
    protected String email;
    protected Long id;
    protected byte[] imagem01;
    protected byte[] imagem02;
    protected byte[] imagem03;
    protected byte[] imagem04;
    protected String nome;
    protected String tif;

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the imagem01 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagem01() {
        return imagem01;
    }

    /**
     * Sets the value of the imagem01 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagem01(byte[] value) {
        this.imagem01 = value;
    }

    /**
     * Gets the value of the imagem02 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagem02() {
        return imagem02;
    }

    /**
     * Sets the value of the imagem02 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagem02(byte[] value) {
        this.imagem02 = value;
    }

    /**
     * Gets the value of the imagem03 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagem03() {
        return imagem03;
    }

    /**
     * Sets the value of the imagem03 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagem03(byte[] value) {
        this.imagem03 = value;
    }

    /**
     * Gets the value of the imagem04 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagem04() {
        return imagem04;
    }

    /**
     * Sets the value of the imagem04 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagem04(byte[] value) {
        this.imagem04 = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the tif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTif() {
        return tif;
    }

    /**
     * Sets the value of the tif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTif(String value) {
        this.tif = value;
    }

}
