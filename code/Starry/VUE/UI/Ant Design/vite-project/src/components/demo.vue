
<template>
  <a-radio-group v-model:value="size">
    <a-radio-button value="large">Large</a-radio-button>
    <a-radio-button value="middle">Middle</a-radio-button>
    <a-radio-button value="small">Small</a-radio-button>
  </a-radio-group>
  <br />
  <br />
  <a-space direction="vertical">
    <a-select
      v-model:value="value1"
      :size="size"
      style="width: 200px"
      :options="options"
    ></a-select>
    <a-select
      v-model:value="value2"
      :options="options"
      mode="multiple"
      :size="size"
      placeholder="Please select"
      style="width: 200px"
      @popupScroll="popupScroll"
    ></a-select>
    <a-select
      v-model:value="value3"
      :options="options"
      mode="tags"
      :size="size"
      placeholder="Please select"
      style="width: 200px"
    ></a-select>
  </a-space>
</template>
<script lang="ts" setup>
import { ref } from 'vue';
import type { SelectProps } from 'ant-design-vue';
const popupScroll = () => {
  console.log('popupScroll');
};
const size = ref<SelectProps['size']>('middle');
const value1 = ref('a1');
const value2 = ref(['a1', 'b2']);
const value3 = ref(['a1', 'b2']);
const options = [...Array(25)].map((_, i) => ({ value: (i + 10).toString(36) + (i + 1) }));
</script>

