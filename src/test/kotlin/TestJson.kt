val testJson = """
{
	"pinpointLocations": [
		{
			"link": "http://weather.livedoor.com/area/forecast/1310100",
			"name": "千代田区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1310200",
			"name": "中央区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1310300",
			"name": "港区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1310400",
			"name": "新宿区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1310500",
			"name": "文京区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1310600",
			"name": "台東区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1310700",
			"name": "墨田区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1310800",
			"name": "江東区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1310900",
			"name": "品川区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311000",
			"name": "目黒区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311100",
			"name": "大田区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311200",
			"name": "世田谷区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311300",
			"name": "渋谷区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311400",
			"name": "中野区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311500",
			"name": "杉並区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311600",
			"name": "豊島区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311700",
			"name": "北区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311800",
			"name": "荒川区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1311900",
			"name": "板橋区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1312000",
			"name": "練馬区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1312100",
			"name": "足立区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1312200",
			"name": "葛飾区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1312300",
			"name": "江戸川区"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1320100",
			"name": "八王子市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1320200",
			"name": "立川市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1320300",
			"name": "武蔵野市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1320400",
			"name": "三鷹市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1320500",
			"name": "青梅市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1320600",
			"name": "府中市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1320700",
			"name": "昭島市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1320800",
			"name": "調布市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1320900",
			"name": "町田市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1321000",
			"name": "小金井市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1321100",
			"name": "小平市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1321200",
			"name": "日野市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1321300",
			"name": "東村山市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1321400",
			"name": "国分寺市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1321500",
			"name": "国立市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1321800",
			"name": "福生市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1321900",
			"name": "狛江市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1322000",
			"name": "東大和市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1322100",
			"name": "清瀬市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1322200",
			"name": "東久留米市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1322300",
			"name": "武蔵村山市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1322400",
			"name": "多摩市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1322500",
			"name": "稲城市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1322700",
			"name": "羽村市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1322800",
			"name": "あきる野市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1322900",
			"name": "西東京市"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1330300",
			"name": "瑞穂町"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1330500",
			"name": "日の出町"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1330700",
			"name": "檜原村"
		},
		{
			"link": "http://weather.livedoor.com/area/forecast/1330800",
			"name": "奥多摩町"
		}
	],
	"link": "http://weather.livedoor.com/area/forecast/130010",
	"forecasts": [
		{
			"dateLabel": "今日",
			"telop": "晴のち曇",
			"date": "2018-08-26",
			"temperature": {
				"min": null,
				"max": {
					"celsius": "37",
					"fahrenheit": "98.6"
				}
			},
			"image": {
				"width": 50,
				"url": "http://weather.livedoor.com/img/icon/5.gif",
				"title": "晴のち曇",
				"height": 31
			}
		},
		{
			"dateLabel": "明日",
			"telop": "晴のち曇",
			"date": "2018-08-27",
			"temperature": {
				"min": {
					"celsius": "26",
					"fahrenheit": "78.8"
				},
				"max": {
					"celsius": "36",
					"fahrenheit": "96.8"
				}
			},
			"image": {
				"width": 50,
				"url": "http://weather.livedoor.com/img/icon/5.gif",
				"title": "晴のち曇",
				"height": 31
			}
		},
		{
			"dateLabel": "明後日",
			"telop": "曇り",
			"date": "2018-08-28",
			"temperature": {
				"min": null,
				"max": null
			},
			"image": {
				"width": 50,
				"url": "http://weather.livedoor.com/img/icon/8.gif",
				"title": "曇り",
				"height": 31
			}
		}
	],
	"location": {
		"city": "東京",
		"area": "関東",
		"prefecture": "東京都"
	},
	"publicTime": "2018-08-26T11:00:00+0900",
	"copyright": {
		"provider": [
			{
				"link": "http://tenki.jp/",
				"name": "日本気象協会"
			}
		],
		"link": "http://weather.livedoor.com/",
		"title": "(C) LINE Corporation",
		"image": {
			"width": 118,
			"link": "http://weather.livedoor.com/",
			"url": "http://weather.livedoor.com/img/cmn/livedoor.gif",
			"title": "livedoor 天気情報",
			"height": 26
		}
	},
	"title": "東京都 東京 の天気",
	"description": {
		"text": " 関東甲信地方は高気圧に覆われていますが、日本海から東北地方にのびる\n前線に向かって暖かく湿った空気が流れ込んでいます。\n\n【関東甲信地方】\n 関東甲信地方は晴れや曇りとなっています。\n\n 26日は、高気圧に覆われておおむね晴れますが、湿った空気の影響で、\n山沿いを中心に曇りや雨となり、雷を伴って激しく降る所があるでしょう。\n\n 27日は、はじめ高気圧に覆われておおむね晴れますが、前線が南下する\nため、次第に曇りや雨となり、雷を伴って激しく降る所がある見込みです。\n\n 関東近海では、27日にかけてうねりを伴い波がやや高いでしょう。\n\n【東京地方】\n 26日は、晴れで夕方から曇るでしょう。夕方から夜のはじめ頃にかけて\n雨や雷雨となる所がある見込みです。\n 27日は、晴れで夕方から曇るでしょう。夕方から夜のはじめ頃にかけて\n雨や雷雨となり、激しく降る所がある見込みです。\n 東京都では27日にかけて高温が予想され、熱中症の危険が特に高くなる\n見込みです。暑さを避け、水分をこまめに補給するなど、十分な対策をとっ\nてください。",
		"publicTime": "2018-08-26T10:38:00+0900"
	}
}
""".trimIndent()
