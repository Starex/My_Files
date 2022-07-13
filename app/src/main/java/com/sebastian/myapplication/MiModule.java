package com.sebastian.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class MiModule implements Parcelable {
    private String name;
    private String apellido;
    private String edad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.apellido);
        dest.writeString(this.edad);
    }

    public void readFromParcel(Parcel source) {
        this.name = source.readString();
        this.apellido = source.readString();
        this.edad = source.readString();
    }

    public MiModule() {
    }

    protected MiModule(Parcel in) {
        this.name = in.readString();
        this.apellido = in.readString();
        this.edad = in.readString();
    }

    public static final Parcelable.Creator<MiModule> CREATOR = new Parcelable.Creator<MiModule>() {
        @Override
        public MiModule createFromParcel(Parcel source) {
            return new MiModule(source);
        }

        @Override
        public MiModule[] newArray(int size) {
            return new MiModule[size];
        }
    };
}
