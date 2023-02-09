// Generated with g9.

package sof3021.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;


import jakarta.persistence.*;

@Entity(name="order_details")
public class OrderDetail implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(name="order_id", nullable=false, precision=10)
    private int orderId;
    @Column(name="product_id", nullable=false, precision=10)
    private int productId;
    @Column(nullable=false, precision=12)
    private float price;
    @Column(nullable=false, precision=10)
    private int quantity;

    /** Default constructor. */
    public OrderDetail() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for orderId.
     *
     * @return the current value of orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Setter method for orderId.
     *
     * @param aOrderId the new value for orderId
     */
    public void setOrderId(int aOrderId) {
        orderId = aOrderId;
    }

    /**
     * Access method for productId.
     *
     * @return the current value of productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Setter method for productId.
     *
     * @param aProductId the new value for productId
     */
    public void setProductId(int aProductId) {
        productId = aProductId;
    }

    /**
     * Access method for price.
     *
     * @return the current value of price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Setter method for price.
     *
     * @param aPrice the new value for price
     */
    public void setPrice(float aPrice) {
        price = aPrice;
    }

    /**
     * Access method for quantity.
     *
     * @return the current value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method for quantity.
     *
     * @param aQuantity the new value for quantity
     */
    public void setQuantity(int aQuantity) {
        quantity = aQuantity;
    }

    /**
     * Compares the key for this instance with another OrderDetail.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OrderDetail and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OrderDetail)) {
            return false;
        }
        OrderDetail that = (OrderDetail) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OrderDetail.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OrderDetail)) return false;
        return this.equalKeys(other) && ((OrderDetail)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[OrderDetail |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
