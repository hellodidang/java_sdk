
import org.json.JSONObject;
import com.youtu.*;

import java.util.ArrayList;

public class Demo {

	// appid, secretid secretkey请到http://open.youtu.qq.com/获取
	// 请正确填写把下面的APP_ID、SECRET_ID和SECRET_KEY
	public static final String APP_ID = "xxx";
	public static final String SECRET_ID = "xxx";
	public static final String SECRET_KEY = "xxx";
	public static final String USER_ID = "xxx"; //qq号

	public static void main(String[] args) {

		try {
			Youtu faceYoutu = new Youtu(APP_ID, SECRET_ID, SECRET_KEY,Youtu.API_YOUTU_END_POINT,USER_ID);
			JSONObject response;
			//response= faceYoutu.FaceCompareUrl("http://open.youtu.qq.com/content/img/slide-1.jpg","http://open.youtu.qq.com/content/img/slide-1.jpg");
			//response = faceYoutu.DetectFace("test.jpg",1);
			//response = faceYoutu.ImageTerrorismUrl("http://open.youtu.qq.com/app/img/experience/terror/img_terror01.jpg");
			//response = faceYoutu.CarClassifyUrl("http://open.youtu.qq.com/app/img/experience/car/car_01.jpg");
			//response = faceYoutu.BizLicenseOcrUrl("http://open.youtu.qq.com/app/img/experience/char_general/ocr_yyzz_01.jpg");
			//response = faceYoutu.CreditCardOcrUrl("http://open.youtu.qq.com/app/img/experience/char_general/ocr_card_1.jpg");
			//response = faceYoutu.PlateOcrUrl("http://open.youtu.qq.com/app/img/experience/char_general/ocr_license_1.jpg");
			response = faceYoutu.FaceMerge("head.jpg","hezuo_junzhuangzhao_2007m_20170919141654");
			//get respose
			System.out.println(response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
