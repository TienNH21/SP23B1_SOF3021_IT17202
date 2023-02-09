// Generated with g9.

package sof3021.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;


import jakarta.persistence.*;

@Entity(name="orders")
public class Order implements Serializable {

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
    @Column(name="user_id", nullable=false, precision=10)
    private int userId;
    @Column(name="create_date", nullable=false)
    private LocalDate createDate;
    @Column(nullable=false, length=255)
    private String address;

    /** Default constructor. */
    public Order() {
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
     * Access method for userId.
     *
     * @return the current value of userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Setter method for userId.
     *
     * @param aUserId the new value for userId
     */
    public void setUserId(int aUserId) {
        userId = aUserId;
    }

    /**
     * Access method for createDate.
     *
     * @return the current value of createDate
     */
    public LocalDate getCreateDate() {
        return createDate;
    }

    /**
     * Setter method for createDate.
     *
     * @param aCreateDate the new value for createDate
     */
    public void setCreateDate(LocalDate aCreateDate) {
        createDate = aCreateDate;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(String aAddress) {
        address = aAddress;
    }

    /**
     * Compares the key for this instance with another Order.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Order and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order that = (Order) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Order.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Order)) return false;
        return this.equalKeys(other) && ((Order)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Order |");
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
