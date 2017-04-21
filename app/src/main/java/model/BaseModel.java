package model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Base model
 */

public class BaseModel implements Parcelable {


    public static final Creator<BaseModel> CREATOR = new Creator<BaseModel>() {
        @Override
        public BaseModel createFromParcel(final Parcel in) {
            return new BaseModel(in);
        }

        @Override
        public BaseModel[] newArray(final int size) {
            return new BaseModel[size];
        }
    };
    private String name;
    /**
     * @param in asd
     */
    protected BaseModel(final Parcel in) {
        name = in.readString();
    }

    /**
     * @param name name
     */
    public BaseModel(final String name) {

        this.name = name;
    }
    /**
     *
     * @return  creater
     */
    public static Creator<BaseModel> getCREATOR() {
        return CREATOR;
    }

    /**
     * @return getting name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name setting name
     */
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     *
     * @param dest dest
     * @param flags flags
     */
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(name);
    }
}
