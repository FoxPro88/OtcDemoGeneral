package com.otc.model.response;

import android.os.Parcel;
import android.os.Parcelable;

public class Keys implements Parcelable {
	private String ivPinHex;
	private String ewkPinHex;
	private String ewkDataHex;
	private String ivDataHex;

	protected Keys(Parcel in) {
		ivPinHex = in.readString();
		ewkPinHex = in.readString();
		ewkDataHex = in.readString();
		ivDataHex = in.readString();
	}

	public static final Creator<Keys> CREATOR = new Creator<Keys>() {
		@Override
		public Keys createFromParcel(Parcel in) {
			return new Keys(in);
		}

		@Override
		public Keys[] newArray(int size) {
			return new Keys[size];
		}
	};

	public void setIvPinHex(String ivPinHex){
		this.ivPinHex = ivPinHex;
	}

	public String getIvPinHex(){
		return ivPinHex;
	}

	public void setEwkPinHex(String ewkPinHex){
		this.ewkPinHex = ewkPinHex;
	}

	public String getEwkPinHex(){
		return ewkPinHex;
	}

	public void setEwkDataHex(String ewkDataHex){
		this.ewkDataHex = ewkDataHex;
	}

	public String getEwkDataHex(){
		return ewkDataHex;
	}

	public void setIvDataHex(String ivDataHex){
		this.ivDataHex = ivDataHex;
	}

	public String getIvDataHex(){
		return ivDataHex;
	}

	@Override
 	public String toString(){
		return 
			"Keys{" + 
			"ivPinHex = '" + ivPinHex + '\'' + 
			",ewkPinHex = '" + ewkPinHex + '\'' + 
			",ewkDataHex = '" + ewkDataHex + '\'' + 
			",ivDataHex = '" + ivDataHex + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(ivPinHex);
		dest.writeString(ewkPinHex);
		dest.writeString(ewkDataHex);
		dest.writeString(ivDataHex);
	}
}
