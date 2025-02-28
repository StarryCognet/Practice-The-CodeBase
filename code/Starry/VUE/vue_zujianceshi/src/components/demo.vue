<template>
  <div class="demo">
    <p>{{ a }}</p>
    <p>{{ asd }}</p>
    <p>{{ age }}</p>
    <button @click="gage">{{ age }}</button>
  </div>
  <tiny-layout>
    <p>基本按钮</p>
    <tiny-row>
      <tiny-button type="primary"> 主要按钮 </tiny-button>
      <tiny-button> 次要按钮 </tiny-button>
      <tiny-button type="success"> 成功按钮 </tiny-button>
      <tiny-button type="info"> 信息按钮 </tiny-button>
      <tiny-button type="warning"> 警告按钮 </tiny-button>
      <tiny-button type="danger"> 危险按钮 </tiny-button>
    </tiny-row>
    <p>朴素按钮</p>
    <tiny-row>
      <tiny-button type="primary" plain> 主要按钮 </tiny-button>
      <tiny-button plain> 次要按钮 </tiny-button>
      <tiny-button type="success" plain> 成功按钮 </tiny-button>
      <tiny-button type="info" plain> 信息按钮 </tiny-button>
      <tiny-button type="warning" plain> 警告按钮 </tiny-button>
      <tiny-button type="danger" plain> 危险按钮 </tiny-button>
    </tiny-row>
    <p>圆角按钮</p>
    <tiny-row>
      <tiny-button type="primary" round> 主要按钮 </tiny-button>
      <tiny-button round> 次要按钮 </tiny-button>
      <tiny-button type="success" round> 成功按钮 </tiny-button>
      <tiny-button type="info" round> 信息按钮 </tiny-button>
      <tiny-button type="warning" round> 警告按钮 </tiny-button>
      <tiny-button type="danger" round> 危险按钮 </tiny-button>
    </tiny-row>
    <p>圆形按钮</p>
    <tiny-row>
      <tiny-button :icon="IconSearch" circle></tiny-button>
      <tiny-button type="primary" :icon="IconEditor" circle></tiny-button>
      <tiny-button type="success" :icon="IconYes" circle></tiny-button>
      <tiny-button type="info" :icon="IconMail" circle></tiny-button>
      <tiny-button type="warning" :icon="IconStarO" circle></tiny-button>
      <tiny-button type="danger" :icon="IconDeleteL" circle></tiny-button>
    </tiny-row>
  </tiny-layout>
  <div>
    <br />
    <div>场景 1：多选</div>
    <br />
    <tiny-base-select v-model="value1" multiple>
      <tiny-option v-for="item in options1" :key="item.value" :label="item.label" :value="item.value"> </tiny-option>
    </tiny-base-select>
    <br />
    <br />
    <br />
    <div>场景 2：必选</div>
    <br />
    <tiny-base-select v-model="value2" multiple>
      <tiny-option
        v-for="item in options2"
        :key="item.value"
        :label="item.label"
        :value="item.value"
        :required="item.required"
      >
      </tiny-option>
    </tiny-base-select>
    <br />
    <br />
    <br />
    <div>场景 3：配置式必选</div>
    <br />
    <tiny-base-select v-model="value3" multiple :options="options2"> </tiny-base-select>
    <br />
    <br />
    <br />
    <div>场景 4：多选个数限制</div>
    <br />
    <tiny-base-select v-model="value4" multiple :multiple-limit="2" show-limit-text>
      <tiny-option v-for="item in options1" :key="item.value" :label="item.label" :value="item.value"> </tiny-option>
    </tiny-base-select>
    <br />
    <br />
    <br />
    <div>场景 5：自定义图标 + 自定义样式</div>
    <br />
    <tiny-base-select
      v-model="value4"
      multiple
      :dropdown-icon="tinyIconPopup"
      :drop-style="{ width: '200px', 'min-width': '200px' }"
    >
      <tiny-option v-for="item in options1" :key="item.value" :label="item.label" :value="item.value"> </tiny-option>
    </tiny-base-select>
    <br />
  </div>
</template>

<script lang="ts">
export default {
  name: 'demo',
}
</script>

<script lang="ts" setup>
// import { ref } from 'vue'
import { TinyButton, TinyLayout, TinyRow } from '@opentiny/vue'
import { iconDeleteL, iconYes, iconEditor, iconMail, iconStarO, iconSearch } from '@opentiny/vue-icon'
import { ref } from 'vue'
import { TinyBaseSelect, TinyOption } from '@opentiny/vue'
import { iconPopup } from '@opentiny/vue-icon'

const IconDeleteL = iconDeleteL()
const IconYes = iconYes()
const IconEditor = iconEditor()
const IconMail = iconMail()
const IconStarO = iconStarO()
const IconSearch = iconSearch()
const options1 = ref([
  { value: '选项 1', label: '北京' },
  { value: '选项 2', label: '上海' },
  { value: '选项 3', label: '天津' },
  { value: '选项 4', label: '重庆' },
  { value: '选项 5', label: '深圳' },
  { value: '选项 6', label: '南京' },
  { value: '选项 7', label: '成都' }
])

const options2 = ref([
  { value: '选项 1', label: '北京' },
  { value: '选项 2', label: '上海' },
  { value: '选项 3', label: '天津' },
  { value: '选项 4', label: '重庆' },
  { value: '选项 5', label: '深圳', required: true },
  { value: '选项 6', label: '南京' },
  { value: '选项 7', label: '成都' }
])

const value1 = ref(['选项 1', '选项 2'])
const value2 = ref(['选项 1', '选项 2'])
const value3 = ref([])
const value4 = ref([])
const tinyIconPopup = iconPopup()


let a = ref(666)
let age = ref(1)
let asd = 486


function gage() {
  age.value += 1
  console.log(age);
}
</script>

<style>
.tiny-row {
  margin: 20px 0;
}

.tiny-button {
  margin-bottom: 10px;
  margin-left: 0;
  margin-right: 24px;
}
</style>