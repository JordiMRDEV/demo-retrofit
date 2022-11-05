
package edu.retrofit.demoretrofit.model.pokeapi;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Generated("jsonschema2pojo")
public class Berry {

    @SerializedName("firmness")
    @Expose
    public Firmness firmness;
    @SerializedName("flavors")
    @Expose
    public List<Flavor> flavors = null;
    @SerializedName("growth_time")
    @Expose
    public Integer growthTime;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("item")
    @Expose
    public Item item;
    @SerializedName("max_harvest")
    @Expose
    public Integer maxHarvest;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("natural_gift_power")
    @Expose
    public Integer naturalGiftPower;
    @SerializedName("natural_gift_type")
    @Expose
    public NaturalGiftType naturalGiftType;
    @SerializedName("size")
    @Expose
    public Integer size;
    @SerializedName("smoothness")
    @Expose
    public Integer smoothness;
    @SerializedName("soil_dryness")
    @Expose
    public Integer soilDryness;

}
