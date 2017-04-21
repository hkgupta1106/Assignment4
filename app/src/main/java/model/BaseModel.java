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

    public static Creator<BaseModel> getCREATOR() {
        return CREATOR;
    }

    String name;
    /**
     *
     * @param name name
     */
    public BaseModel(String name) {

        this.name = name;
    }
    /**
     *
     * @return getting name
     * */
    public String getName() {
        return name;
    }
    /**
     *
     * @param name setting name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(name);
    }

    /**
     *
     * @param in asd
     */
    protected BaseModel(final Parcel in) {
        name = in.readString();
    }
}
