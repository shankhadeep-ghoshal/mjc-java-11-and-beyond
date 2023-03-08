package com.shankhadeepghoshal;

import com.shankhadeepghoshal.collections.CollectionUtils;
import com.shankhadeepghoshal.httpclient.RestService;
import com.shankhadeepghoshal.patternmatchinginstanceof.ShapeUtils;
import com.shankhadeepghoshal.sealedclassandrecords.Circle;
import com.shankhadeepghoshal.sealedclassandrecords.ShapeEnum;
import com.shankhadeepghoshal.sealedclassandrecords.Triangle;
import com.shankhadeepghoshal.strings.StringUtils;

/**
 * @author <a href="mailto:shankhadeepghoshal1996@gmail.com">Shankhadeep Ghoshal</a>
 **/

public class Main {

		public static void main(String[] args) {
				CollectionUtils.localRecordsAndNewToList();

				final var shape = ShapeUtils.getShape(ShapeEnum.PARALLELOGRAM, 10.0, 20.0);
				System.out.println(shape);

				ShapeUtils.checkShapeInstance(new Circle(2.0));
				ShapeUtils.checkShapeInstance(new Triangle(2.0, 5.0));

				CollectionUtils.mapMultiDemo();

				new RestService().makeGetRequest();
				new RestService().makePostRequest();

				StringUtils.newStringMethods();
		}
}
