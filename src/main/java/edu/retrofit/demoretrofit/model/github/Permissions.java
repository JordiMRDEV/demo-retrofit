
package edu.retrofit.demoretrofit.model.github;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Generated("jsonschema2pojo")
public class Permissions {

    @SerializedName("admin")
    @Expose
    public Boolean admin;
    @SerializedName("maintain")
    @Expose
    public Boolean maintain;
    @SerializedName("push")
    @Expose
    public Boolean push;
    @SerializedName("triage")
    @Expose
    public Boolean triage;
    @SerializedName("pull")
    @Expose
    public Boolean pull;

}
