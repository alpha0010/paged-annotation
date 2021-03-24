import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.Serializable

@Serializable
data class PositionedText(
  val color: String,
  val fontSize: Float,
  val point: List<Float>,
  val str: String
)

@Serializable
data class Stroke(
  val color: String,
  val width: Float,
  val path: List<List<Float>>
)

@Serializable
data class AnnotationPage(
  val strokes: List<Stroke>,
  val text: List<PositionedText>
)

var parsedData = emptyList<AnnotationPage>()
try {
  parsedData = Json.decodeFromString(File("Path to data").readText())
  // `parsedData` contains the validated array of pages.
} catch (e: Exception) {
  // Handle decode error.
}
