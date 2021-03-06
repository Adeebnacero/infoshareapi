package domain.location

import play.api.libs.json.Json

case class AddressType(id: String, name: String, state: String)

object AddressType {
  implicit val addressFmt = Json.format[AddressType]
  def identity: AddressType = AddressType("", "", "")
}
