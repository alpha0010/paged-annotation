struct PositionedText: Decodable {
    let color: String
    let fontSize: CGFloat
    let point: [CGFloat]
    let str: String
}

struct Stroke: Decodable {
    let color: String
    let width: CGFloat
    let path: [[CGFloat]]
}

struct AnnotationPage: Decodable {
    let strokes: [Stroke]
    let text: [PositionedText]
}

let decoder = JSONDecoder()
do {
    let data = try Data(contentsOf: URL(fileURLWithPath: "Path to data"))
    let parsedData = try decoder.decode([AnnotationPage].self, from: data)
    // `parsedData` contains the validated array of pages.
} catch {
    // Handle decode error.
}
