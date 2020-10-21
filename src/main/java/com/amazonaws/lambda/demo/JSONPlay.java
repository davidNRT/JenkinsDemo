package com.amazonaws.lambda.demo;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONPlay {

	public static void main(String[] args) {

		String json = "[{version=0, id=0d6dc934-4a09-ef41-6a3b-b610bf8dd6bf, detail-type=AWS API Call via CloudTrail, source=aws.lambda, account=417240572660, time=2020-09-09T05:48:54Z, region=us-east-1, resources=[], detail={eventVersion=1.05, userIdentity={type=Root, principalId=417240572660, arn=arn:aws:iam::417240572660:root, accountId=417240572660, accessKeyId=ASIAWCJLZ4L2FKLO3YRX, sessionContext={sessionIssuer={}, webIdFederationData={}, attributes={mfaAuthenticated=false, creationDate=2020-09-09T04:34:45Z}}}, eventTime=2020-09-09T05:48:54Z, eventSource=lambda.amazonaws.com, eventName=CreateFunction20150331, awsRegion=us-east-1, sourceIPAddress=173.79.119.161, userAgent=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.89 Safari/537.36, requestParameters={functionName=Delete, runtime=java8, role=arn:aws:iam::417240572660:role/service-role/Delete-role-rafvhtcj, handler=example.Hello::handleRequest, code={}, timeout=15, memorySize=512, publish=false, vpcConfig={}, deadLetterConfig={}, environment={}, tracingConfig={mode=PassThrough}}, responseElements={functionName=Delete, functionArn=arn:aws:lambda:us-east-1:417240572660:function:Delete, runtime=java8, role=arn:aws:iam::417240572660:role/service-role/Delete-role-rafvhtcj, handler=example.Hello::handleRequest, codeSize=8881, description=, timeout=15, memorySize=512, lastModified=2020-09-09T05:48:54.851+0000, codeSha256=+5OFdvMKaO8/kzr0r4xnwDOEQnUU0/aHkDjIF2GtoUw=, version=$LATEST, environment={}, tracingConfig={mode=PassThrough}, revisionId=ff001d37-0741-4abf-8a2a-44c65811e462, state=Active, lastUpdateStatus=Successful}, requestID=a90a201c-1ae9-4034-b661-50cd715d370f, eventID=3368ec37-e0f9-453e-a4e7-eabea99d1711, eventType=AwsApiCall}}]";
		JSONObject obj = new JSONObject(json);

		// String pageName =
		// obj.getJSONObject("responseElements").getString("functionName");

		// System.out.println(pageName);

		JSONArray arr = obj.getJSONArray("functionName");
		for (int i = 0; i < arr.length(); i++) {
			String post_id = arr.getJSONObject(i).getString("functionName");
			System.out.println(post_id);
		}
	}
}
